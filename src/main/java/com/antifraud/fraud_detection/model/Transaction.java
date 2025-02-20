package com.antifraud.fraud_detection.model;

import jakarta.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    private String status;

    // Default constructor
    public Transaction(){}

    public Transaction(double amount, String status) {
        this.amount = amount;
        this.status = status;
    }

    public Transaction(Long id, double amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
