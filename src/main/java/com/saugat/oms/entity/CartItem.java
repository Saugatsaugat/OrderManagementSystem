package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "cart_item")
public class CartItem extends EntityChangeTracker{

    @Column(name = "unit_price")
    private BigDecimal unitPrice = new BigDecimal(0);

    @Column(name = "quantity", nullable = false)
    @NotNull(message = "Quantity can not be null.")
    private Float quantity = 1f;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    @NotNull(message = "Cart can not be null.")
    private Cart cart;

    public CartItem() {}

    public CartItem(BigDecimal unitPrice, Float quantity, Cart cart) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.cart = cart;
    }

    public CartItem(Long id, BigDecimal unitPrice, Float quantity, Cart cart) {
        super(id);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.cart = cart;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
