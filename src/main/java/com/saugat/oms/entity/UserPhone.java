package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_phone", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "phone_id"})})
public class UserPhone extends EntityChangeTracker{

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @NotNull(message = "User cannot be null.")
    private User user;

    @ManyToOne
    @JoinColumn(name = "phone_id", nullable = false)
    @NotNull(message = "Phone cannot be null.")
    private Phone phone;

    public UserPhone() {}

    public UserPhone(User user, Phone phone) {
        this.user = user;
        this.phone = phone;
    }

    public UserPhone(Long id, User user, Phone phone) {
        super(id);
        this.user = user;
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
