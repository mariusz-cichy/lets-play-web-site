package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.emcea.letsplaywebsite.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
