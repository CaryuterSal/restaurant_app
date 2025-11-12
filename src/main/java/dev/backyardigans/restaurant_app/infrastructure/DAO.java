package dev.backyardigans.restaurant_app.infrastructure;

import java.util.List;

public interface DAO<T> {
    void insert(T t);
    void update(T t);
    void delete(String id);
    T findById(String id);
    List<T> findAll();
}