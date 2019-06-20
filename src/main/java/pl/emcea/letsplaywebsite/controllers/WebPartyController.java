package pl.emcea.letsplaywebsite.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.emcea.letsplaywebsite.exceptions.NotEnoughPiecesException;
import pl.emcea.letsplaywebsite.models.*;
import pl.emcea.letsplaywebsite.repositories.*;
import pl.emcea.letsplaywebsite.services.ImageService;
import pl.emcea.letsplaywebsite.services.OrderService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class WebPartyController {

    PoolRepository poolRepository;
    ItemRepository itemRepository;
    ImageService imageService;
    OrderRepository orderRepository;
    OrderItemRepository orderItemRepository;
    CustomerRepository customerRepository;
    OrderService orderService;

    public WebPartyController(PoolRepository poolRepository, ItemRepository itemRepository, ImageService imageService,
                              OrderRepository orderRepository, OrderItemRepository orderItemRepository,
                              CustomerRepository customerRepository, OrderService orderService) {
        this.poolRepository = poolRepository;
        this.itemRepository = itemRepository;
        this.imageService = imageService;
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.customerRepository = customerRepository;
        this.orderService = orderService;
    }

    @RequestMapping({"", "/", "/home"})
    public String homePage(Model model) {
        model.addAttribute("pool", poolRepository.findByEndDateIsNull());
        return "homePage";
    }

    @RequestMapping({"/items"})
    public String itemsPage(Model model) {
        model.addAttribute("items", itemRepository.findByCelebrationOrderById("Rocznica ślubu"));
        return "items";
    }

    @RequestMapping({"/items/{id}"})
    public String itemsByCelebration(Model model, @PathVariable String id) {
        switch (id) {
            case "1":
                model.addAttribute("items", itemRepository.findByCelebrationOrderById("Rocznica ślubu"));
                break;
            case "2":
                model.addAttribute("items", itemRepository.findByCelebrationOrderById("Urodziny"));
                break;
            case "3":
                model.addAttribute("items", itemRepository.findByCelebrationOrderById("Boże Narodzenie"));
                break;
            case "4":
                model.addAttribute("items", itemRepository.findByCelebrationOrderById("Impreza firmowa"));
                break;
        }
        return "items";
    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    public String itemPage(@ModelAttribute("error") String error, Model model, @PathVariable String id) {
        model.addAttribute("item", itemRepository.findById(Integer.valueOf(id)).get());
        model.addAttribute("error", error);
        return "item";
    }

    @RequestMapping(value = "/item/{id}", method = {RequestMethod.POST})
    public String buyHirePage(@PathVariable String id,
                              @RequestParam(value = "buy_pcs") String buy_pcs,
                              Model model,
                              RedirectAttributes redirectAttributes) {

        Customer customer;
        customer = customerRepository.findById(1).get();
        Item item;
        item = itemRepository.findById(Integer.valueOf(id)).get();

        System.out.println("id: " + id);
        System.out.println("buy_pcs: " + buy_pcs);

        // Check if there is OPEN order for the legged-in Customer
        // If not then create one.
        List<OrderItem> orderItems;
        Order order = orderRepository.findOrderByCustomerAndStatus(customer, OrderStatus.OPEN);
        if (order == null) {
            orderItems = new ArrayList<>();
            order = new Order(customer, OrderStatus.OPEN, orderItems);
            orderRepository.save(order);
        }
        orderItems = order.getOrderItems();

        // Sprawdzenie czy została wpisana liczba całkowita.
        int buy_pcs_int;
        try {
            buy_pcs_int = Integer.valueOf(buy_pcs);
        } catch (NumberFormatException e) {
            redirectAttributes.addFlashAttribute("error", "Liczba sztuk musi być liczbą całkowitą nieujemną.");
            return "redirect:/item/" + id;
        }

        // Sprawdzenie czy liczba jest dodatnia
        if (buy_pcs_int < 0) {
            redirectAttributes.addFlashAttribute("error", "Liczba produktów musi być nieujemna.");
            return "redirect:/item/" + id;
        }

        // Sprawdzenie czy jest wystarczająca ilość produktów w magazynie
        // tu nie sprawdzamy, czy wcześiej nie były dodawane już takie produkty
        // tu sprawdzamy stan magazynowy na poziomie pojedynczego dodania
        if (buy_pcs_int > item.getStock_buy()) {
            redirectAttributes.addFlashAttribute("error", "Nie ma tyle produktów w magazynie.");
            return "redirect:/item/" + id;
        }

        OrderItem orderItem=null;
        boolean itemAlreadyInBasket = false;
        Iterator<OrderItem> iterator = orderItems.iterator();
        while (iterator.hasNext()) {
            orderItem = iterator.next();
            if (orderItem.getItem().getId() == item.getId()) {
                itemAlreadyInBasket = true;
                orderItem.setBuyPieces(orderItem.getBuyPieces() + buy_pcs_int);
                break;
            }
        }
        // Jeżeli nie ma produktu w koszyku to dodanie do koszyka
        if (itemAlreadyInBasket == false) {
            orderItem = new OrderItem(item, order, buy_pcs_int, 0);
            orderItems.add(orderItem);
            order.setOrderItems(orderItems);
        }

//        orderItemRepository.save(orderItem);
        orderRepository.save(order);

        return "redirect:/item/" + id;
    }

    Iterator<OrderItem> iterator;

    @GetMapping("/items/{id}/image")
    public void renderImageFromDB(@PathVariable String id, HttpServletResponse response) throws IOException {
        Item item = itemRepository.findById(Integer.valueOf(id)).get();
        imageService.loadImage(item.getImage(), response);
    }


    @RequestMapping("/about")
    public String aboutPage() {
        return "aboutPage";
    }

    @GetMapping("/basket")
    public String basketPage(Model model) {
        // TODO: Zmienić "1" na ID zalogowanego klienta
        Map<String, String> errors;

        Customer customer = customerRepository.findById(1).get();

        List<OrderItem> orderItems;
        Order order = orderRepository.findOrderByCustomerAndStatus(customer, OrderStatus.OPEN);
        if (order == null) {
            orderItems = new ArrayList<>();
            order = new Order(customer, OrderStatus.OPEN, orderItems);
            orderRepository.save(order);
        }

        errors = orderService.verifyOrder(order);
        model.addAttribute("order", order);
        model.addAttribute("errors", errors);
        return "basket";
    }

    @PostMapping("/basket")
    public String basketSubmitPage(BasketItems basketItems, Model model) {
        Map<String, String> errors;
        // TODO: Zmienić "1" na ID zalogowanego klienta
        Customer customer = customerRepository.findById(1).get();
        Order order = orderRepository.findOrderByCustomerAndStatus(customer, OrderStatus.OPEN);
        orderService.updateOrder(order, basketItems);
        errors = orderService.verifyOrder(order);
        model.addAttribute("order", order);
        model.addAttribute("errors", errors);
        if (errors.size() == 0) {
            return "order";
        } else {
            return "basket";
        }
    }

    @PostMapping("/confirmation")
    public String vote(Model model) {
        Customer customer = customerRepository.findById(1).get();
        Order order = orderRepository.findOrderByCustomerAndStatus(customer, OrderStatus.OPEN);

        try {
            orderService.submitOrder(order);
            return "confirmation";
        } catch (NotEnoughPiecesException e) {
            e.printStackTrace();
        }
        return "basket";
    }

    @GetMapping("/pools")
    public String pools(Model model) {
        List<Pool> pools = poolRepository.findByOrderByStartDateDesc();
        model.addAttribute("pools", pools);
        return "pools";
    }


    @PostMapping("/vote/{id}")
    public String vote(@PathVariable String id, @RequestParam("vote") String vote) {
        poolRepository.updateUserSetStatusForName(Integer.valueOf(vote));
        return "redirect:/pools";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/register")
    public String register() {
        return "/register";
    }
}
