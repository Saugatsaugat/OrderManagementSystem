package com.saugat.oms.dto;

import java.time.Instant;

public class NotificationDto extends EntityChangeTrackerDto{

    private String type;
    private String message;
    private String status;
    private Instant sentAt;
    private UserDto user;

    public NotificationDto(){}

    public NotificationDto(String type, String message, String status, Instant sentAt, UserDto user) {
        this.type = type;
        this.message = message;
        this.status = status;
        this.sentAt = sentAt;
        this.user = user;
    }

    public NotificationDto(Long id, String type, String message, String status, Instant sentAt, UserDto user) {
        super(id);
        this.type = type;
        this.message = message;
        this.status = status;
        this.sentAt = sentAt;
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getSentAt() {
        return sentAt;
    }

    public void setSentAt(Instant sentAt) {
        this.sentAt = sentAt;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
