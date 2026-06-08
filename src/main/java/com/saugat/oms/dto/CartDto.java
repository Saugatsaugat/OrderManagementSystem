package com.saugat.oms.dto;

import java.util.List;

public class CartDto extends EntityChangeTrackerDto{

    private UserDto user;
    private List<ProductDetailDto> items;

    public CartDto() {}

    public CartDto(UserDto user, List<ProductDetailDto> items) {
        this.user = user;
        this.items = items;
    }

    public CartDto(Long id, UserDto user, List<ProductDetailDto> items) {
        super(id);
        this.user = user;
        this.items = items;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<ProductDetailDto> getItems() {
        return items;
    }

    public void setItems(List<ProductDetailDto> items) {
        this.items = items;
    }
}
