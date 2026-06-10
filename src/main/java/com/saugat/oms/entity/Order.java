package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "order")
public class Order extends EntityChangeTracker{

    @Column(name = "status", nullable = false)
    @NotNull(message = "Status cannot be null.")
    private String status;

    @Column(name = "total_amount", nullable = false)
    @NotNull(message = "Total Amount can not be null.")
    private BigDecimal totalAmount = new BigDecimal(0);

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @NotNull(message = "User can not be null.")
    private User user;

    @ManyToOne
    @JoinColumn(name = "shipping_address", nullable = false)
    @NotNull(message = "Shipping Address can not be null.")
    private Address shippingAddress;

    public Order() {}

    public Order(String status, BigDecimal totalAmount, User user, Address shippingAddress) {
        this.status = status;
        this.totalAmount = totalAmount;
        this.user = user;
        this.shippingAddress = shippingAddress;
    }

    public Order(Long id, String status, BigDecimal totalAmount, User user, Address shippingAddress) {
        super(id);
        this.status = status;
        this.totalAmount = totalAmount;
        this.user = user;
        this.shippingAddress = shippingAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
