package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User extends EntityChangeTracker {

    @Column(name = "email", nullable = false, unique = true)
    @Email(message = "Invalid email format")
    private String email;

    @Column(name = "hash", nullable = false)
    @NotNull(message = "Password is required")
    private String hash;

    @Column(name = "salt")
    private String salt;

    @Column(name = "status", nullable = false)
    private String status = "ACTIVE";

    @Column(name = "type", nullable = false)
    private String type = "USER";

    public User() {
    }

    public User(String email, String hash, String salt, String status, String type) {
        this.email = email;
        this.hash = hash;
        this.salt = salt;
        this.status = status;
        this.type = type;
    }

    public User(Long id, String email, String hash, String salt, String status, String type) {
        super(id);
        this.email = email;
        this.hash = hash;
        this.salt = salt;
        this.status = status;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}