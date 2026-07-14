package com.saugat.oms.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderDetailDto extends EntityChangeTrackerDto{

    private Float quantity;
    private BigDecimal unitPrice;
    private String productSnapshot;
    private OrderDto order;
    private List<ProductDto> products;

    public OrderDetailDto() {}

    public OrderDetailDto(Float quantity, BigDecimal unitPrice, String productSnapshot, OrderDto order, List<ProductDto> products) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productSnapshot = productSnapshot;
        this.order = order;
        this.products = products;
    }

    public OrderDetailDto(Long id, Float quantity, BigDecimal unitPrice, String productSnapshot, OrderDto order, List<ProductDto> products) {
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

    public OrderDto getOrder() {
        return order;
    }

    public void setOrder(OrderDto order) {
        this.order = order;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
