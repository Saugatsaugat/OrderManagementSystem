package com.saugat.oms.dto;

public class UserDetailDto extends EntityChangeTrackerDto {

    private String firstname;
    private String midname;
    private String lastname;
    private String dob;
    private String sex;
    private UserDto user;

    public UserDetailDto() {}

    public UserDetailDto(String firstname, String midname, String lastname, String dob, String sex, UserDto user) {
        this.firstname = firstname;
        this.midname = midname;
        this.lastname = lastname;
        this.dob = dob;
        this.sex = sex;
        this.user = user;
    }

    public UserDetailDto(Long id, String firstname, String midname, String lastname, String dob, String sex, UserDto user) {
        super(id);
        this.firstname = firstname;
        this.midname = midname;
        this.lastname = lastname;
        this.dob = dob;
        this.sex = sex;
        this.user = user;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
