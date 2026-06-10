package com.saugat.oms.dto;

import java.math.BigDecimal;

public class OrderDto extends EntityChangeTrackerDto{
    private String status;
    private BigDecimal totalAmount;
    private UserDto user;
    private AddressDto shippingAddress;

    public OrderDto() {}

    public OrderDto(String status, BigDecimal totalAmount, UserDto user, AddressDto shippingAddress) {
        this.status = status;
        this.totalAmount = totalAmount;
        this.user = user;
        this.shippingAddress = shippingAddress;
    }

    public OrderDto(Long id, String status, BigDecimal totalAmount, UserDto user, AddressDto shippingAddress) {
        super(id);
        this.status = status;
        this.totalAmount = totalAmount;
        this.user = user;
        this.shippingAddress = shippingAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public AddressDto getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(AddressDto shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
