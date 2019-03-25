package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.emcea.letsplaywebsite.models.BasketItem;

@Repository
public interface BasketItemRepository extends CrudRepository<BasketItem, Integer> {
}
