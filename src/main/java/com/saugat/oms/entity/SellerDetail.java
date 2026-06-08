package com.saugat.oms.entity;

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

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public SellerDetail() {}

    public SellerDetail(LocalDateTime registeredOn, Seller seller, Address address) {
        this.registeredOn = registeredOn;
        this.seller = seller;
        this.address = address;
    }

    public SellerDetail(Long id, LocalDateTime registeredOn, Seller seller, Address address) {
        super(id);
        this.registeredOn = registeredOn;
        this.seller = seller;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
