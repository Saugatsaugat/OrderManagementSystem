package com.saugat.oms.exceptions;

import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException {
    private final String code;
    private final HttpStatus status;
    private final String error;

    public BusinessException(String code, HttpStatus status, String error, String message) {
        super(message);
        this.code = code;
        this.status = status;
        this.error = error;
    }

    public String getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }
}