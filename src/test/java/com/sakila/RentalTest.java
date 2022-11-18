package com.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RentalTest {
    Rental testRental = new Rental();

    Rental testRentalConstructor = new Rental(3,3,3,3);

    @Test
    void testGetRentalId() {
        testRental.setRentalId(2);
        Assertions.assertEquals(2,testRental.getRentalId(),"Wrong Rental ID");
    }

    @Test
    void testGetInvId () {
        testRental.setInventoryId(2);
        Assertions.assertEquals(2,testRental.getInventoryId(),"Wrong Rental Inventory ID");
    }

    @Test
    void testGetCustId () {
        testRental.setCustomerId(2);
        Assertions.assertEquals(2,testRental.getCustomerId(),"Wrong Rental Customer ID ");
    }

    @Test
    void testGetStaffId () {
        testRental.setStaffId(2);
        Assertions.assertEquals(2,testRental.getStaffId(),"Wrong Rental Staff ID");
    }

    @Test
    void testToString() {
        Assertions.assertEquals("rental{rentalId=3, inventoryId=3, customerId=3, staffId=3}",testRentalConstructor.toString(),"Wrong Rental ToString");
    }

}
