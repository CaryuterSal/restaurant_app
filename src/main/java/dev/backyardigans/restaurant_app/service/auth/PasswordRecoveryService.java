package dev.backyardigans.restaurant_app.service.auth;

public interface PasswordRecoveryService {
    boolean sendRecoveryCode(String correo);
    boolean validateRecoveryCode(String correo, String codigo);
    boolean resetPassword(String correo, String nuevaContraseña);
}