package dev.backyardigans.restaurant_app.controller.shared;
public interface Validator<T> {
    boolean isValid(T obj);
}