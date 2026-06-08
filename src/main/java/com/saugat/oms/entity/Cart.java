package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "cart")
public class Cart extends EntityChangeTracker{

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    @NotNull(message = "User can not be null.")
    private User user;

    @OneToMany
    @JoinColumn(name = "items")
    private List<Product> items;

    public Cart() {}

    public Cart(User user, List<Product> items) {
        this.user = user;
        this.items = items;
    }

    public Cart(Long id, User user, List<Product> items) {
        super(id);
        this.user = user;
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
}
