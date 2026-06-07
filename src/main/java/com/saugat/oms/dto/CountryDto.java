package com.saugat.oms.dto;

public class CountryDto extends EntityChangeTrackerDto {

    private String code;
    private String name;

    public CountryDto() {
    }

    public CountryDto(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public CountryDto(Long id, String code, String name) {
        super(id);
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
