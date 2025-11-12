package dev.backyardigans.restaurant_app.service.order;

import dev.backyardigans.restaurant_app.model.order.Order;

public interface KitchenService {
    void receiveOrder(Order order);
    void markAsComplete(Order order);
}
