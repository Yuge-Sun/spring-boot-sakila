package com.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ActorTest {
    Actor testActor = new Actor();

    @Test
    void  testConstructor() {

    }

    @Test
    void testGetActorId() {
        testActor.setActor_id(2);
        Assertions.assertEquals(2, testActor.getActor_id(), "Wrong Actor ID");
    }

    @Test
    void testGetFirstName() {
        testActor.setFirst_name("NICK");
        Assertions.assertEquals("NICK", testActor.getFirst_name(), "Wrong Actor First Name");
    }

    @Test
    void testGetLastName() {
        testActor.setLast_name("WAHLBERG");
        Assertions.assertEquals("WAHLBERG", testActor.getLast_name(), "Wrong Actor Last Name");
    }
}
