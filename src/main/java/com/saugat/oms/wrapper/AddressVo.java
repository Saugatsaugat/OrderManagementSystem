package com.saugat.oms.wrapper;

public class AddressVo extends EntityChangeTrackerVo{
    private String type;
    private String street;
    private String building;
    private String city;
    private String state;
    private String zip;
    private CountryVo country;

    public AddressVo() {
    }

    public AddressVo(String type, String street, String building, String city, String state, String zip, CountryVo country) {
        this.type = type;
        this.street = street;
        this.building = building;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public AddressVo(Long id, String type, String street, String building, String city, String state, String zip, CountryVo country) {
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

    public CountryVo getCountry() {
        return country;
    }

    public void setCountry(CountryVo country) {
        this.country = country;
    }
}
