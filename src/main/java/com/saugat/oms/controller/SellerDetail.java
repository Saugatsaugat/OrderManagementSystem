package com.saugat.oms.controller;

import com.saugat.oms.entity.EntityChangeTracker;
import com.saugat.oms.entity.Seller;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "seller_detail")
public class SellerDetail extends EntityChangeTracker {

    @Column(name = "registered_on")
    private LocalDateTime registeredOn;

    @OneToOne
    @JoinColumn(name = "seller_id", nullable = false)
    @NotNull(message = "Seller cannot be null.")
    private Seller seller;

    public SellerDetail() {}

    public SellerDetail(LocalDateTime registeredOn, Seller seller) {
        this.registeredOn = registeredOn;
        this.seller = seller;
    }

    public SellerDetail(Long id, LocalDateTime registeredOn, Seller seller) {
        super(id);
        this.registeredOn = registeredOn;
        this.seller = seller;
    }

    public LocalDateTime getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(LocalDateTime registeredOn) {
        this.registeredOn = registeredOn;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
