package com.saugat.oms.dto;

public class AddressDto extends EntityChangeTrackerDto {
    private String type;
    private String street;
    private String building;
    private String city;
    private String state;
    private String zip;
    private CountryDto country;

    public AddressDto() {
    }

    public AddressDto(String type, String street, String building, String city, String state, String zip, CountryDto country) {
        this.type = type;
        this.street = street;
        this.building = building;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public AddressDto(Long id, String type, String street, String building, String city, String state, String zip, CountryDto country) {
        super(id);
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

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }
}
