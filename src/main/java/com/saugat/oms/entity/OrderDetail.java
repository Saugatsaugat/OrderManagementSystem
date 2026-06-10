package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "orderDetail")
public class OrderDetail extends EntityChangeTracker{

    @Column(name = "quantity", nullable = false)
    @NotNull(message = "Quantity can not be null.")
    private Float quantity;

    @Column(name = "unit_price", nullable = false)
    @NotNull(message = "Unit price can not be null.")
    private BigDecimal unitPrice;

    @Column(name = "product_snapshot")
    private String productSnapshot;

    @OneToOne
    @JoinColumn(name = "order", nullable = false)
    @NotNull(message = "Order can not be null.")
    private Order order;

    @OneToMany
    @JoinColumn(name = "products", nullable = false)
    private List<Product> products;

    public OrderDetail() {}

    public OrderDetail(Float quantity, BigDecimal unitPrice, String productSnapshot, Order order, List<Product> products) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productSnapshot = productSnapshot;
        this.order = order;
        this.products = products;
    }

    public OrderDetail(Long id, Float quantity, BigDecimal unitPrice, String productSnapshot, Order order, List<Product> products) {
        super(id);
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productSnapshot = productSnapshot;
        this.order = order;
        this.products = products;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductSnapshot() {
        return productSnapshot;
    }

    public void setProductSnapshot(String productSnapshot) {
        this.productSnapshot = productSnapshot;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
