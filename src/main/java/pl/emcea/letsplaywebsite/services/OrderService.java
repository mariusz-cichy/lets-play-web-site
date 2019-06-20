package pl.emcea.letsplaywebsite.services;

import org.springframework.transaction.annotation.Transactional;
import pl.emcea.letsplaywebsite.controllers.BasketItems;
import pl.emcea.letsplaywebsite.exceptions.NotEnoughPiecesException;
import pl.emcea.letsplaywebsite.models.Order;

import java.util.Map;

@Transactional
public interface OrderService {
    void updateOrder(Order order, BasketItems basketItems);
    Map<String, String> verifyOrder(Order order);
    void submitOrder(Order order) throws NotEnoughPiecesException;
}
