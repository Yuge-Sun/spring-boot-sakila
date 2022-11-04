package com.sakila;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;


@ScenarioScope
public class FilmNameStepDef {

    @Autowired
    public ActorRepository actorRepository;
    @Autowired
    public FilmRepository filmRepository;
    @Autowired
    SakilaApplication film = new SakilaApplication(actorRepository,filmRepository);
    int filmid;
    Film filminfo;
    @Given("film exists")
    public void film_exists() {
        filmid = 1;
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("user search for film name")
    public void user_search_for_film_name() {
        filminfo = film.filmRepository.findById(filmid).orElseThrow(() -> new ResourceAccessException("Actor not found at " + filmid));
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("show film details")
    public void show_film_details() {
        Assertions.assertEquals("Film{filmId=1, title='ACADEMY DINOSAUR', description='A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies', releaseYear=2006, rentalRate=0.99, length=86, replacementCost=20.99, rating='PG'}",filminfo.toString(),"Wrong name");
        // Assertions.assertEquals();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
