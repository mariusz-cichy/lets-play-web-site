package pl.emcea.letsplaywebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.emcea.letsplaywebsite.controllers.BasketItem;
import pl.emcea.letsplaywebsite.controllers.BasketItems;
import pl.emcea.letsplaywebsite.exceptions.NotEnoughPiecesException;
import pl.emcea.letsplaywebsite.models.Order;
import pl.emcea.letsplaywebsite.models.OrderItem;
import pl.emcea.letsplaywebsite.repositories.ItemRepository;
import pl.emcea.letsplaywebsite.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemRepository itemRepository;

    @Override
    @Transactional
    public void updateOrder(Order order, BasketItems basketItems) {

        for (OrderItem oi: order.getOrderItems()) {

            System.out.println(">itemId= " + oi.getItem().getId());
            System.out.println(">buy= " + oi.getBuyPieces());
            for (BasketItem bi : basketItems.getBasketItems() ) {
                if (oi.getItem().getId() == Integer.valueOf(bi.getName())) {
                    System.out.println("  >>name= " + bi.getName());
                    System.out.println("  >>pieces= " + bi.getPieces());
                    oi.setBuyPieces(Integer.valueOf(bi.getPieces()));
                }
            }
        }
        orderRepository.save(order);
    }

    @Override
    @Transactional(rollbackFor = NotEnoughPiecesException.class)
    public void submitOrder(Order order) throws NotEnoughPiecesException {
        for (OrderItem orderItem: order.getOrderItems()) {
            int oiId = orderItem.getItem().getId();
            int oiBuy = orderItem.getBuyPieces();
            System.out.println("oiId: "+oiId);
            System.out.println("oiBuy: "+oiBuy);
            System.out.println("stockBuy: "+itemRepository.findItemById(oiId).getStock_buy());
            if (itemRepository.findItemById(oiId).getStock_buy() < oiBuy) {
                throw new NotEnoughPiecesException("Za mało produktów!");
            }
        }
    }
}
