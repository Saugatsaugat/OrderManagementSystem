package com.saugat.oms.dto;

public class CategoryDto extends EntityChangeTrackerDto {

    private String code;
    private String name;

    public CategoryDto(){}

    public CategoryDto(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public CategoryDto(Long id, String code, String name) {
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
