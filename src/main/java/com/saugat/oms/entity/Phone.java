package com.saugat.oms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone extends EntityChangeTracker{

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "country_code", nullable = false, unique = true)
    private String countryCode;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "is_verified", nullable = false)
    private Boolean isVerified = false;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    public Phone() {
    }

    public Phone(String type, String countryCode, String number, Boolean isVerified, Boolean isActive) {
        this.type = type;
        this.countryCode = countryCode;
        this.number = number;
        this.isVerified = isVerified;
        this.isActive = isActive;
    }

    public Phone(Long id, String type, String countryCode, String number, Boolean isVerified, Boolean isActive) {
        super(id);
        this.type = type;
        this.countryCode = countryCode;
        this.number = number;
        this.isVerified = isVerified;
        this.isActive = isActive;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
