package com.saugat.oms.dto;

import java.io.Serializable;

public class PKEntityDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    public PKEntityDto() {
    }

    public PKEntityDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}