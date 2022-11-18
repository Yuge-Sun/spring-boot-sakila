package com.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {
    Film testFilm = new Film();

    Film testFilmConstructor = new Film("ACE GOLDFINGER", "A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China", 2006, 4.99, 48, 12.99, "G");

    @Test
    void testGetFilmId() {
        testFilm.setFilmId(2);
        Assertions.assertEquals(2, testFilm.getFilmId(), "Wrong Film ID");
    }

    @Test
    void testGetTitle() {
        testFilm.setTitle("ACE GOLDFINGER");
        Assertions.assertEquals("ACE GOLDFINGER", testFilm.getTitle(), "Wrong Film Title");
    }
    @Test
    void testGetDescription() {
        testFilm.setDescription("A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China");
        Assertions.assertEquals("A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China", testFilm.getDescription(), "Wrong Film Description");
    }
    @Test
    void testGetReleaseYear() {
        testFilm.setReleaseYear(2006);
        Assertions.assertEquals(2006, testFilm.getReleaseYear(), "Wrong Film Release Year");
    }

    @Test
    void testGetRentalRate() {
        testFilm.setRentalRate(4.99);
        Assertions.assertEquals(4.99, testFilm.getRentalRate(),"Wrong Film Rental Rate");
    }

    @Test
    void  testGetLength() {
        testFilm.setLength(48);
        Assertions.assertEquals(48, testFilm.getLength(),"Wrong Film Length");
    }

    @Test
    void testGetReplacementCost() {
        testFilm.setReplacementCost(12.99);
        Assertions.assertEquals(12.99, testFilm.getReplacementCost(),"Wrong Film Replacement Cost");
    }

    @Test
    void testGetRating() {
        testFilm.setRating("G");
        Assertions.assertEquals("G", testFilm.getRating(), "Wrong Film Rating");
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Film{filmId=0, title='ACE GOLDFINGER', description='A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China', releaseYear=2006, rentalRate=4.99, length=48, replacementCost=12.99, rating='G'}", testFilmConstructor.toString(), "Wrong Film ToString");
    }
}
