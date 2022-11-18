package com.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PaymentTest {

    Payment testPayment = new Payment();

    Payment testPaymentConstructor = new Payment(3,3,3,3,1.99);

    @Test
    void testGetPaymentId() {
        testPayment.setPaymentId(2);
        Assertions.assertEquals(2,testPayment.getPaymentId(),"Wrong Payment ID");
    }

    @Test
    void testGetCustId() {
        testPayment.setCustomerId(2);
        Assertions.assertEquals(2,testPayment.getCustomerId(),"Wrong Payment Customer ID");
    }
    @Test
    void testGetStaffId () {
        testPayment.setStaffId(2);
        Assertions.assertEquals(2,testPayment.getStaffId(),"Wrong Payment Staff ID");
    }

    @Test
    void testGetRentalId () {
        testPayment.setRentalId(2);
        Assertions.assertEquals(2,testPayment.getRentalId(),"Wrong Payment Rental ID");
    }

    @Test
    void testGetAmount () {
        testPayment.setAmount(1.99);
        Assertions.assertEquals(1.99,testPayment.getAmount(),"Wrong Payment Amount");
    }

    @Test
    void testToString () {
        Assertions.assertEquals("payment{paymentId=3, customerId=3, staffId=3, rentalId=3, amount=1.99}",testPaymentConstructor.toString(), "Wrong Payment ToString");
    }
}

