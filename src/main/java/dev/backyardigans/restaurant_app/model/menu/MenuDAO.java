package dev.backyardigans.restaurant_app.model.menu;


import dev.backyardigans.restaurant_app.infrastructure.DAO;

import java.util.List;

public interface MenuDAO extends DAO<Dish> {
    List<Dish> findByCategory(Category category);
}

