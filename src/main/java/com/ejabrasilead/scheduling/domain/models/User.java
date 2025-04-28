package com.ejabrasilead.scheduling.domain.models;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private String email;
    private String role;

    public User(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
