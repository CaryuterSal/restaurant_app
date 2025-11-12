package dev.backyardigans.restaurant_app.model.user;

import java.util.UUID;

public abstract class User {
    protected UUID id;
    protected String name;
    protected String email;
    protected String password;

    public abstract void showProfile();
}

