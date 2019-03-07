package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.emcea.letsplaywebsite.models.Item;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
    List<Item> findAllByCelebrationsOrderById(String celebration);
}
