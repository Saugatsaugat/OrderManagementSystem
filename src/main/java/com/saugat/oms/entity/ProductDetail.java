package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_detail")
public class ProductDetail extends EntityChangeTracker{

    @Column(name = "description")
    private String description;

    @Column(name = "color")
    private String color;

    @Column(name = "length")
    private Float length;

    @Column(name = "manufactured_date")
    private LocalDateTime manufacturedDate;

    @Column(name = "height")
    private Float height;

    @Column(name = "radius")
    private Float radius;

    @Column(name = "width")
    private Float width;

    @Column(name = "expiryDate")
    private LocalDateTime expiryDate;

    @OneToOne
    @JoinColumn(name = "product_id", nullable = false)
    @NotNull(message = "Product can not be null.")
    private Product product;

    public ProductDetail() {}

    public ProductDetail(String description, String color, Float length, LocalDateTime manufacturedDate, Float height, Float radius, Float width, LocalDateTime expiryDate, Product product) {
        this.description = description;
        this.color = color;
        this.length = length;
        this.manufacturedDate = manufacturedDate;
        this.height = height;
        this.radius = radius;
        this.width = width;
        this.expiryDate = expiryDate;
        this.product = product;
    }

    public ProductDetail(Long id, String description, String color, Float length, LocalDateTime manufacturedDate, Float height, Float radius, Float width, LocalDateTime expiryDate, Product product) {
        super(id);
        this.description = description;
        this.color = color;
        this.length = length;
        this.manufacturedDate = manufacturedDate;
        this.height = height;
        this.radius = radius;
        this.width = width;
        this.expiryDate = expiryDate;
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public LocalDateTime getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDateTime manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
