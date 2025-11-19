package dev.backyardigans.restaurant_app;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.util.regex.Pattern;

public class ForgotPasswordController {

    @FXML
    private TextField campoCorreo;

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE
    );

    @FXML
    private void manejarRestablecerContrasena(ActionEvent event) {
        String correo = campoCorreo.getText().trim();

        if (correo.isEmpty()) {
            mostrarAlerta(Alert.AlertType.ERROR, "Campo Requerido", "Por favor, introduce tu correo electrónico.");
            return;
        }

        if (!EMAIL_PATTERN.matcher(correo).matches()) {
            mostrarAlerta(Alert.AlertType.ERROR, "Formato Inválido", "El correo electrónico no tiene un formato válido.");
            return;
        }

        mostrarAlerta(
                Alert.AlertType.INFORMATION,
                "Proceso Iniciado",
                "Se ha enviado un correo electrónico a " + correo + " con instrucciones para restablecer tu contraseña. (Simulación)"
        );

        campoCorreo.setText("");
    }
    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensaje) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
