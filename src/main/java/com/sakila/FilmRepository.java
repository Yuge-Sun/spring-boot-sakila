package com.sakila;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM sakila.film WHERE sakila.film.film_id = ?1")
    Film getFilmNum(int id);

    @Query(nativeQuery = true, value = "SELECT \n" +
            "       SUM(`p`.`amount`) AS `total_sales`\n" +
            "     FROM\n" +
            "        (((((`payment` `p`\n" +
            "        JOIN `rental` `r` ON ((`p`.`rental_id` = `r`.`rental_id`)))\n" +
            "        JOIN `inventory` `i` ON ((`r`.`inventory_id` = `i`.`inventory_id`)))\n" +
            "        JOIN `film` `f` ON ((`i`.`film_id` = `f`.`film_id`)))))\n" +
            "        WHERE `f`.`film_id` LIKE ?1 \n" +
            "    GROUP BY `f`.`film_id`")
    double getFilmSales(int filmId);
}
