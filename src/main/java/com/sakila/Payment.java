package com.sakila;

import javax.persistence.*;

@Entity
@Table(name = "inventory")

public class Payment {
    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int paymentId;

    @ManyToOne
    private Rental rental;

    @Column(name = "customer_id")
    int customerId;

    @Column(name = "staff_id")
    int staffId;

    @Column(name = "rental_id")
    int rentalId;

    @Column(name = "amount")
    double amount;

    public Payment(int paymentId, int customerId, int staffId, int rentalId, double amount) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.staffId= staffId;
        this.rentalId = rentalId;
        this.amount = amount;
    }

    public Payment() {
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "payment{" +
                "paymentId=" + paymentId +
                ", customerId=" + customerId +
                ", staffId=" + staffId +
                ", rentalId=" + rentalId +
                ", amount=" + amount +
                '}';
    }
}
