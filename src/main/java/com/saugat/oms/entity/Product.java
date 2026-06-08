package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product")
public class Product extends EntityChangeTracker{

    @Column(name = "name", nullable = false)
    @NotNull(message = "Name can not be null.")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "price", nullable = false)
    @NotNull(message = "Price can not be null.")
    private BigDecimal price= new BigDecimal(0);

    @Column(name = "stock")
    private Float stock = 0f;

    @OneToMany
    @JoinColumn(name = "categories")
    @NotNull(message = "Category can not be null.")
    private List<Category> categories;

    @OneToOne
    @JoinColumn(name = "seller_id", nullable = false)
    @NotNull(message = "Seller can not be null.")
    private Seller seller;

    public Product() {}

    public Product(String name, String code, BigDecimal price, Float stock, List<Category> categories, Seller seller) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.categories = categories;
        this.seller = seller;
    }

    public Product(Long id, String name, String code, BigDecimal price, Float stock, List<Category> categories, Seller seller) {
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

    public Float getStock() {
        return stock;
    }

    public void setStock(Float stock) {
        this.stock = stock;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
