package dev.backyardigans.restaurant_app.service.notification;

import dev.backyardigans.restaurant_app.model.order.Order;

public interface NotificationService {
    void notifyStateChange(Order orden);
    void notifyKitchenReady(Order orden);
}
