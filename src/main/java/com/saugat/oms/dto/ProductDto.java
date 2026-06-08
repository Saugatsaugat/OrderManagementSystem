package com.saugat.oms.dto;

import java.math.BigDecimal;
import java.util.List;

public class ProductDto extends EntityChangeTrackerDto{
    private String name;
    private String code;
    private BigDecimal price;
    private float stock;
    private List<CategoryDto> categories;
    private SellerDto seller;

    public ProductDto() {}

    public ProductDto(String name, String code, BigDecimal price, float stock, List<CategoryDto> categories, SellerDto seller) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.categories = categories;
        this.seller = seller;
    }

    public ProductDto(Long id, String name, String code, BigDecimal price, float stock, List<CategoryDto> categories, SellerDto seller) {
        super(id);
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.categories = categories;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public List<CategoryDto> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDto> categories) {
        this.categories = categories;
    }

    public SellerDto getSeller() {
        return seller;
    }

    public void setSeller(SellerDto seller) {
        this.seller = seller;
    }
}
