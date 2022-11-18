package com.sakila.Cucumber;

import com.sakila.ActorRepository;
import com.sakila.Film;
import com.sakila.FilmRepository;
import com.sakila.SakilaApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;


@ScenarioScope
public class FilmDetailStepDef {

    @Autowired
    public ActorRepository actorRepository;
    @Autowired
    public FilmRepository filmRepository;
    @Autowired
    SakilaApplication film = new SakilaApplication(actorRepository,filmRepository);
    int filmid;
    Film filminfo;
    @Given("website shows the movie posters to the user")
    public void websiteShowsTheMoviePostersToTheUser() {
        filmid = 1;
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("user hover over the movie poster")
    public void userHoverOverTheMoviePoster() {
        filminfo = film.filmRepository.findById(filmid).orElseThrow(() -> new ResourceAccessException("Film not found at " + filmid));
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("show film title and film description")
    public void showFilmTitleAndFilmDescription() {
        Assertions.assertEquals("Film{filmId=1, title='ACADEMY DINOSAUR', description='A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies', releaseYear=2006, rentalRate=0.99, length=86, replacementCost=20.99, rating='PG'}",filminfo.toString(),"Wrong name");
        // Assertions.assertEquals();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }



}
