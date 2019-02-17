package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.emcea.letsplaywebsite.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findProductById(Long id);
}
