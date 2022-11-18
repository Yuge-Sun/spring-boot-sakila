package com.sakila;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InventoryTest {

    Inventory testInventory = new Inventory();

    Inventory testInventoryConstructor = new Inventory(0,0,0);

    @Test
    void testGetInvId() {
        testInventory.setInventoryId((2));
        Assertions.assertEquals(2,testInventory.getInventoryId(),"Wrong Inventory ID");
    }

    @Test
    void testGetFilmId() {
        testInventory.setFilmId(2);
        Assertions.assertEquals(2,testInventory.getFilmId(),"Wrong Inventory Film ID");
    }

    @Test
    void testGetStoreId() {
        testInventory.setStoreId(2);
        Assertions.assertEquals(2,testInventory.getStoreId(),"Wrong Inventory Store ID");
    }

    @Test
    void testToString() {
        Assertions.assertEquals("inventory{inventoryId=0, filmId=0, storeId=0}",testInventoryConstructor.toString(),"Wrong Inventory ToString");
    }
}
