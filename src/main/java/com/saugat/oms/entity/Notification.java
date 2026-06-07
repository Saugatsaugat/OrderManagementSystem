package com.saugat.oms.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "notification")
public class Notification extends EntityChangeTracker{

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "message")
    private String message;

    @Column(name = "status", nullable = false)
    private String status = "CREATED";

    @Column(name = "sent_at")
    private Instant sentAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Notification(){}

    public Notification(String type, String message, String status, Instant sentAt, User user) {
        this.type = type;
        this.message = message;
        this.status = status;
        this.sentAt = sentAt;
        this.user = user;
    }

    public Notification(Long id, String type, String message, String status, Instant sentAt, User user) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
