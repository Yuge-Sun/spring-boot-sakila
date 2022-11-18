package com.sakila;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rental")

public class Rental {

    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rentalId;

    @ManyToOne
    private Inventory inventory;

    @OneToMany(mappedBy = "rental")
    private List<Payment> paymentList;

    @Column(name = "inventory_id")
    int inventoryId;

    @Column(name = "customer_id")
    int customerId;

    @Column(name = "staff_id")
    int staffId;

    public Rental(int rentalId, int inventoryId, int customerId, int staffId) {
        this.rentalId = rentalId;
        this.inventoryId = inventoryId;
        this.customerId = customerId;
        this.staffId= staffId;
    }

    public Rental() {
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
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

    @Override
    public String toString() {
        return "rental{" +
                "rentalId=" + rentalId +
                ", inventoryId=" + inventoryId +
                ", customerId=" + customerId +
                ", staffId=" + staffId +
                '}';
    }
}
