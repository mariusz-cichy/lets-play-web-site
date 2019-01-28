package pl.emcea.letsplaywebsite.services;

import pl.emcea.letsplaywebsite.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
