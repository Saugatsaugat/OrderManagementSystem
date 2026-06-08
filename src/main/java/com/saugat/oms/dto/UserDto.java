package com.saugat.oms.dto;

public class UserDto extends EntityChangeTrackerDto {

    private String email;
    private String hash;
    private String salt;
    private String status;
    private String type;

    public UserDto() {
    }

    public UserDto(String email, String hash, String salt, String status, String type) {
        this.email = email;
        this.hash = hash;
        this.salt = salt;
        this.status = status;
        this.type = type;
    }

    public UserDto(Long id, String email, String hash, String salt, String status, String type) {
        super(id);
        this.email = email;
        this.hash = hash;
        this.salt = salt;
        this.status = status;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
