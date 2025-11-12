module dev.backyardigans.restaurant_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.backyardigans.restaurant_app to javafx.fxml;
    exports dev.backyardigans.restaurant_app;
}