package com.saugat.oms.dto;

public class SellerPhoneDto extends EntityChangeTrackerDto{

    private SellerDto seller;
    private PhoneDto phone;

    public SellerPhoneDto() {}

    public SellerPhoneDto(SellerDto seller, PhoneDto phone) {
        this.seller = seller;
        this.phone = phone;
    }

    public SellerPhoneDto(Long id, SellerDto seller, PhoneDto phone) {
        super(id);
        this.seller = seller;
        this.phone = phone;
    }

    public SellerDto getSeller() {
        return seller;
    }

    public void setSeller(SellerDto seller) {
        this.seller = seller;
    }

    public PhoneDto getPhone() {
        return phone;
    }

    public void setPhone(PhoneDto phone) {
        this.phone = phone;
    }
}
