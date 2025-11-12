package dev.backyardigans.restaurant_app.service.auth;

import dev.backyardigans.restaurant_app.model.user.User;

public interface AuthService {
    User login(String correo, String contraseña);
    void logout();
    boolean isAuthenticated();
    User getCurrentUser();
}