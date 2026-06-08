package com.saugat.oms.dto;

public class SellerDto extends EntityChangeTrackerDto {

    private String name;
    private String email;
    private String type;
    private UserDto owner;

    public SellerDto() {}

    public SellerDto(String name, String email, String type, UserDto owner) {
        this.name = name;
        this.email = email;
        this.type = type;
        this.owner = owner;
    }

    public SellerDto(Long id, String name, String email, String type, UserDto owner) {
        super(id);
        this.name = name;
        this.email = email;
        this.type = type;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserDto getOwner() {
        return owner;
    }

    public void setOwner(UserDto owner) {
        this.owner = owner;
    }
}
