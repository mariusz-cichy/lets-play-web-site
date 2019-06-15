package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.emcea.letsplaywebsite.models.Item;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
    List<Item> findByCelebrationOrderById(String celebration);

    Item findItemById(Integer id);

    @Query("select count(stock_buy) from items where id=:id")
    int getItemBuyStockCount(Integer id);

    //    @Query("update pool_answers pa set votes = votes+1 where id=:id")
    //    void updateItemCount(@Param("pieces") Integer pieces);
}
