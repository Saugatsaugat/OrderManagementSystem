package com.saugat.oms.dto;

public class UserPhoneDto extends EntityChangeTrackerDto{

    private UserDto user;
    private PhoneDto phone;

    public UserPhoneDto() {}

    public UserPhoneDto(UserDto user, PhoneDto phone) {
        this.user = user;
        this.phone = phone;
    }

    public UserPhoneDto(Long id, UserDto user, PhoneDto phone) {
        super(id);
        this.user = user;
        this.phone = phone;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public PhoneDto getPhone() {
        return phone;
    }

    public void setPhone(PhoneDto phone) {
        this.phone = phone;
    }
}
