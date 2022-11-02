package com.Sakila.Sakila;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;

import java.util.Optional;


@ScenarioScope
public class ActorNameStepDef {

    @Autowired
    public actorRepository actorRepository;
    @Autowired
    SakilaApplication actor = new SakilaApplication(actorRepository);
    int actorid;
    actor actorinfo;
    @Given("actor exists")
    public void actor_exists() {
        actorid = 1;
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("user search for actor name")
    public void user_search_for_actor_name() {
        actorinfo = actor.actorRepository.findById(actorid).orElseThrow(() -> new ResourceAccessException("Actor not found at " + actorid));
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("show actor details")
    public void show_actor_details() {
        Assertions.assertEquals("Actor id = 1 first name = PENELOPE last name = GUINESS",actorinfo.toString(),"Wrong name");
        // Assertions.assertEquals();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
