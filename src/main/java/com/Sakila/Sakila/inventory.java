package com.Sakila.Sakila;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "inventory")


public class inventory {
    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int inventoryId;

    @ManyToOne
    private film film;

    @OneToMany(mappedBy = "inventory")
    private List<rental> rentalList;

    @Column(name = "film_id")
    int filmId;

    @Column(name = "store_id")
    int storeId;



    public inventory(int inventoryId, int filmId, int storeId) {
        this.inventoryId = inventoryId;
        this.filmId = filmId;
        this.storeId = storeId;
    }

    public inventory() {
    }

    public int getInventoryId() {
        return this.inventoryId;
    }

    public int getFilmId() {
        return this.filmId;
    }

    public int getStoreId() {
        return this.storeId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return "inventory{" +
                "inventoryId=" + inventoryId +
                ", filmId=" + filmId +
                ", storeId=" + storeId +
                '}';
    }
}
