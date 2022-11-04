package com.sakila;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Inventoryrepository extends JpaRepository<Inventory, Integer> {
}
