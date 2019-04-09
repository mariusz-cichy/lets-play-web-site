package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.emcea.letsplaywebsite.models.Customer;
import pl.emcea.letsplaywebsite.models.Order;
import pl.emcea.letsplaywebsite.models.OrderStatus;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    Order findOrderByCustomerAndStatus(Customer customer, OrderStatus status);
}
