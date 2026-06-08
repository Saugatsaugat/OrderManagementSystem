package com.saugat.oms.dto;

import java.time.LocalDateTime;

public class SellerDetailDto extends EntityChangeTrackerDto{

    private LocalDateTime registeredOn;
    private SellerDto seller;

    public SellerDetailDto() {}

    public SellerDetailDto(LocalDateTime registeredOn, SellerDto seller) {
        this.registeredOn = registeredOn;
        this.seller = seller;
    }

    public SellerDetailDto(Long id, LocalDateTime registeredOn, SellerDto seller) {
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

    public SellerDto getSeller() {
        return seller;
    }

    public void setSeller(SellerDto seller) {
        this.seller = seller;
    }
}
