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

    @Column(name = "mobile", unique = true)
    private String mobile;

    @Column(name = "pass", nullable = false)
    @NotNull(message = "Password is required")
    private String pass;

    public User() {
    }

    public User(String email, String mobile, String pass) {
        this.email = email;
        this.mobile = mobile;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}