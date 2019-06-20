package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.emcea.letsplaywebsite.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findCustomerByEmail(String email);
}
