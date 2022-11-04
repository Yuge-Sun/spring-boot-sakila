package com.Sakila.Sakila;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface inventoryRepository extends JpaRepository<inventory, Integer> {
}
