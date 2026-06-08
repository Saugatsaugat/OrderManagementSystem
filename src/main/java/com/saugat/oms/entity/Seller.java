package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "seller")
public class Seller extends EntityChangeTracker{

    @Column(name = "name", nullable = false)
    @NotNull(message = "Name cannot be null.")
    private String name;

    @Column(name = "email", nullable = false)
    @Email(message = "Email")
    private String email;

    @Column(name = "type")
    private String type;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public Seller() {}

    public Seller(String name, String email, String type, User owner) {
        this.name = name;
        this.email = email;
        this.type = type;
        this.owner = owner;
    }

    public Seller(Long id, String name, String email, String type, User owner) {
        super(id);
        this.name = name;
        this.email = email;
        this.type = type;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
