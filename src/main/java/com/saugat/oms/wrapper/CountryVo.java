package com.saugat.oms.wrapper;

public class CountryVo extends EntityChangeTrackerVo {

    private String code;
    private String name;

    public CountryVo() {
    }

    public CountryVo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public CountryVo(Long id, String code, String name) {
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
