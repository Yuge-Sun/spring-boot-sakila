package com.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {
    Film testFilm = new Film();



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
}
