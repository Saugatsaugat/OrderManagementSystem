package com.saugat.oms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_detail")
public class UserDetail extends EntityChangeTracker{

    @Column(name = "firstname", nullable = false)
    @NotNull(message = "Firstname cannot be null.")
    private String firstname;

    @Column(name = "midname")
    private String midname;

    @Column(name = "lastname", nullable = false)
    @NotNull(message = "Lastname cannot be null.")
    private String lastname;

    @Column(name = "dob", nullable = false)
    @NotNull(message = "Date of birth cannot be null.")
    private String dob;

    @Column(name = "sex", nullable = false)
    @NotNull(message = "Sex cannot be null.")
    private String sex;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    @NotNull(message = "User cannot be null.")
    private User user;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public UserDetail(){}

    public UserDetail(String firstname, String midname, String lastname, String dob, String sex, User user, Address address) {
        this.firstname = firstname;
        this.midname = midname;
        this.lastname = lastname;
        this.dob = dob;
        this.sex = sex;
        this.user = user;
        this.address = address;
    }

    public UserDetail(Long id, String firstname, String midname, String lastname, String dob, String sex, User user, Address address) {
        super(id);
        this.firstname = firstname;
        this.midname = midname;
        this.lastname = lastname;
        this.dob = dob;
        this.sex = sex;
        this.user = user;
        this.address= address;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
