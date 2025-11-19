package dev.backyardigans.restaurant_app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField campoCorreo;
    @FXML
    private PasswordField campoContrasena;

    @FXML
    private void manejarInicioSesion(ActionEvent event) {

        String correo = campoCorreo.getText().trim();
        String contrasena = campoContrasena.getText();

        // SIMULACIÓN pq no hay bd
        if (correo.isEmpty() || contrasena.isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Campos Vacíos", "Por favor, ingresa tu correo y contraseña.");
        }
        else if (correo.equals("admin") && contrasena.equals("123")) {
            mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "¡Inicio de sesión exitoso! Bienvenido.");

        }
        else {
            mostrarAlerta(Alert.AlertType.ERROR, "Error de Autenticación", "Correo o contraseña incorrectos. Por favor, inténtalo de nuevo.");
        }
    }


    @FXML
    private void manejarOlvidoContrasena(ActionEvent event) {
        try {
            Hyperlink sourceLink = (Hyperlink) event.getSource();
            Stage stageActual = (Stage) sourceLink.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ForgotPassword.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stageActual.setTitle("Restablecer Contraseña");
            stageActual.setScene(scene);
            stageActual.show();

        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta(Alert.AlertType.ERROR, "Error de Navegación", "No se pudo cargar la pantalla de restablecimiento");
        } catch (ClassCastException e) {
            System.err.println("Error");
        }
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensaje) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}