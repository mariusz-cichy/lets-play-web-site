package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.emcea.letsplaywebsite.models.Product;

import java.util.Set;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
