package pl.emcea.letsplaywebsite.controllers;


import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.emcea.letsplaywebsite.models.*;
import pl.emcea.letsplaywebsite.repositories.BasketItemRepository;
import pl.emcea.letsplaywebsite.repositories.CustomerRepository;
import pl.emcea.letsplaywebsite.repositories.ItemRepository;
import pl.emcea.letsplaywebsite.repositories.PoolRepository;
import pl.emcea.letsplaywebsite.services.ImageService;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class WebPartyController {

    PoolRepository poolRepository;
    ItemRepository itemRepository;
    ImageService imageService;
    BasketItemRepository basketItemRepository;
    CustomerRepository customerRepository;

    public WebPartyController(PoolRepository poolRepository,
                              ItemRepository itemRepository,
                              ImageService imageService,
                              BasketItemRepository basketItemRepository,
                              CustomerRepository customerRepository) {
        this.poolRepository = poolRepository;
        this.itemRepository = itemRepository;
        this.imageService = imageService;
        this.basketItemRepository = basketItemRepository;
        this.customerRepository = customerRepository;
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
    public String itemPage(Model model, @PathVariable String id) {
        model.addAttribute("item", itemRepository.findById(Integer.valueOf(id)).get());
        return "item";
    }

    @RequestMapping(value = "/item/{id}", method = {RequestMethod.POST})
    public String buyHirePage(@PathVariable String id,
                              @RequestParam(value = "buy_pcs") String buy_pcs,
                              @RequestParam(value = "hire_pcs", required = false) String hire_pcs) {

        Customer customer;
        customer = customerRepository.findById(1).get();
        Item item;
        item = itemRepository.findById(Integer.valueOf(id)).get();

        System.out.println("id: " + id);
        System.out.println("buy_pcs: " + buy_pcs);
        System.out.println("hire_pcs: " + hire_pcs);
        BasketItem basketItem = new BasketItem(customer, item, Integer.valueOf(buy_pcs), Integer.valueOf(hire_pcs));
        basketItemRepository.save(basketItem);
        return "redirect:/item/" + id;
    }

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
        model.addAttribute("greeting", new Greeting());
        return "basketPage";
    }

    @PostMapping("/basket")
    public String basketSubmitPage(@ModelAttribute Greeting greeting) {
        return "basketPage";
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
        return "/loginPage";
    }

    @GetMapping("/register")
    public String register() {
        return "/registerPage";
    }
}
