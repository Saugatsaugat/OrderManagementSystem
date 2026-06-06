package com.saugat.oms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address extends EntityChangeTracker{

    @Column(name = "type")
    private String type;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "building")
    private String building;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zip", nullable = false)
    private String zip;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    public Address() {
    }

    public Address(String type, String street, String building, String city, String state, String zip, Country country) {
        this.type = type;
        this.street = street;
        this.building = building;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    public Address(Long id, String type, String street, String building, String city, String state, String zip, Country country) {
        this.setId(id);
        this.type = type;
        this.street = street;
        this.building = building;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
