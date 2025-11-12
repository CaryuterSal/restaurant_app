package dev.backyardigans.restaurant_app.model.order;

import dev.backyardigans.restaurant_app.infrastructure.DAO;

import java.util.List;

public interface OrderDAO extends DAO<Order> {
    List<Order> findByWaiter(String waiterId);
    List<Order> findByState(State state);

}
