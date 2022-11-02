package com.Sakila.Sakila;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface filmRepository extends JpaRepository<film, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film WHERE sakila.film.film_id = 21")
    film getFilmById(int id);
}
