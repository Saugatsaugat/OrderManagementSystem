package com.saugat.oms.dto;

import java.time.LocalDateTime;

public class ProductDetailDto extends EntityChangeTrackerDto{

    private String description;
    private String color;
    private Float length;
    private LocalDateTime manufacturedDate;
    private Float height;
    private Float radius;
    private Float width;
    private LocalDateTime expiryDate;
    private ProductDto product;

    public ProductDetailDto() {}

    public ProductDetailDto(String description, String color, Float length, LocalDateTime manufacturedDate, Float height, Float radius, Float width, LocalDateTime expiryDate, ProductDto product) {
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

    public ProductDetailDto(Long id, String description, String color, Float length, LocalDateTime manufacturedDate, Float height, Float radius, Float width, LocalDateTime expiryDate, ProductDto product) {
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

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }
}
