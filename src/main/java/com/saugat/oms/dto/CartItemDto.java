package com.saugat.oms.dto;

import com.saugat.oms.entity.Cart;

import java.math.BigDecimal;

public class CartItemDto extends EntityChangeTrackerDto{
    private BigDecimal unitPrice;
    private Float quantity;
    private Cart cart;

    public CartItemDto() {}

    public CartItemDto(BigDecimal unitPrice, Float quantity, Cart cart) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.cart = cart;
    }

    public CartItemDto(Long id, BigDecimal unitPrice, Float quantity, Cart cart) {
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
