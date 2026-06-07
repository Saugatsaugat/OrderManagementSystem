package com.saugat.oms.dto;

public class UserDto extends EntityChangeTrackerDto {

    private String email;
    private String mobile;
    private String pass;

    public UserDto() {
    }

    public UserDto(String email, String mobile, String pass) {
        this.email = email;
        this.mobile = mobile;
        this.pass = pass;
    }

    public UserDto(Long id, String email, String mobile, String pass) {
        super(id);
        this.email = email;
        this.mobile = mobile;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
