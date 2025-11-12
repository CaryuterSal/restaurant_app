package dev.backyardigans.restaurant_app.model.user;

import dev.backyardigans.restaurant_app.infrastructure.DAO;

public interface UserDAO extends DAO<User> {
    User findByEmail(String email);
}