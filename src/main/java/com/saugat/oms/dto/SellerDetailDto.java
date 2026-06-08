package com.saugat.oms.dto;

import java.time.LocalDateTime;

public class SellerDetailDto extends EntityChangeTrackerDto{

    private LocalDateTime registeredOn;
    private SellerDto seller;
    private AddressDto address;


    public SellerDetailDto() {}

    public SellerDetailDto(LocalDateTime registeredOn, SellerDto seller, AddressDto address) {
        this.registeredOn = registeredOn;
        this.seller = seller;
        this.address = address;
    }

    public SellerDetailDto(Long id, LocalDateTime registeredOn, SellerDto seller, AddressDto address) {
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

    public SellerDto getSeller() {
        return seller;
    }

    public void setSeller(SellerDto seller) {
        this.seller = seller;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
