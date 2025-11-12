package dev.backyardigans.restaurant_app.model.payment;

import dev.backyardigans.restaurant_app.infrastructure.DAO;

import java.time.LocalDate;
import java.util.List;

public interface PaymentDAO extends DAO<Payment> {
    List<Payment> findByDate(LocalDate date);
}
