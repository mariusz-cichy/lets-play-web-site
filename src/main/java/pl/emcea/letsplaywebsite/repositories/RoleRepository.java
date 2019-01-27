package pl.emcea.letsplaywebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.emcea.letsplaywebsite.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
