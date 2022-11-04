package com.sakila;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "film")

public class Film {
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;

    @OneToMany(mappedBy = "film")
    private List<Inventory> inventoryList;


    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;
    @Column(name = "release_year")
    int releaseYear;
    @Column(name = "rental_rate")
    double rentalRate;
    @Column(name = "length")
    int length;
    @Column(name = "replacement_cost")
    double replacementCost;
    @Column(name = "rating")
    String rating;



    public Film(String title, String description, int releaseYear, double rentalRate, int length, double replacementCost, String rating) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
    }

    public Film() {
    }
    public int getFilmId() {
        return this.filmId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRentalRate() {
        return this.rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return this.replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", rentalRate=" + rentalRate +
                ", length=" + length +
                ", replacementCost=" + replacementCost +
                ", rating='" + rating + '\'' +
                '}';
    }
}
