package com.saugat.oms.dto;

public class PhoneDto extends EntityChangeTrackerDto {
    private String type;
    private String countryCode;
    private String number;
    private Boolean isVerified = false;
    private Boolean isActive = false;

    public PhoneDto() {
    }

    public PhoneDto(String type, String countryCode, String number, Boolean isVerified, Boolean isActive) {
        this.type = type;
        this.countryCode = countryCode;
        this.number = number;
        this.isVerified = isVerified;
        this.isActive = isActive;
    }

    public PhoneDto(Long id, String type, String countryCode, String number, Boolean isVerified, Boolean isActive) {
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
