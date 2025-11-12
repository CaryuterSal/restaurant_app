package dev.backyardigans.restaurant_app.model.order;

import dev.backyardigans.restaurant_app.model.menu.Dish;

import java.util.UUID;

public interface OrderItem {
    UUID getId();
    Dish getPlatillo();
    int getCantidad();
    double getSubtotal();
}
