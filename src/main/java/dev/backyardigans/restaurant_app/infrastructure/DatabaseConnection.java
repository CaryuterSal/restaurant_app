package dev.backyardigans.restaurant_app.infrastructure;

import java.sql.Connection;

public interface DatabaseConnection {
    Connection getConnection();
    void closeConnection();
}