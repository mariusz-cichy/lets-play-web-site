package pl.emcea.letsplaywebsite.services;

import org.springframework.transaction.annotation.Transactional;
import pl.emcea.letsplaywebsite.controllers.BasketItems;
import pl.emcea.letsplaywebsite.exceptions.NotEnoughPiecesException;
import pl.emcea.letsplaywebsite.models.Order;

@Transactional
public interface OrderService {

    void updateOrder(Order order, BasketItems basketItems);
    void submitOrder(Order order) throws NotEnoughPiecesException;

}
