package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "seller_phone",uniqueConstraints = {@UniqueConstraint(columnNames = {"seller_id", "phone_id"})})
public class SellerPhone extends EntityChangeTracker{

    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    @NotNull(message = "Seller cannot be null.")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "phone_id", nullable = false)
    @NotNull(,message = "Phone cannot be null.")
    private Phone phone;

    public SellerPhone() {}

    public SellerPhone(Seller seller, Phone phone) {
        this.seller = seller;
        this.phone = phone;
    }

    public SellerPhone(Long id, Seller seller, Phone phone) {
        super(id);
        this.seller = seller;
        this.phone = phone;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
