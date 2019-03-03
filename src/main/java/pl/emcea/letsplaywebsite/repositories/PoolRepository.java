package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.emcea.letsplaywebsite.models.Pool;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PoolRepository extends CrudRepository<Pool, Integer> {
    List<Pool> findByOrderByStartDateDesc();

    Pool findByEndDateIsNull();

    @Transactional
    @Modifying
    @Query("update pool_answers pa set votes = votes+1 where id=:id")
    void updateUserSetStatusForName(@Param("id") Integer id);
}