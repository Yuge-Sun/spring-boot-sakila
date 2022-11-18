package com.sakila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin

public class SakilaApplication {

	@Autowired
	public ActorRepository actorRepository;
	public FilmRepository filmRepository;
	public SakilaApplication(ActorRepository actorRepository, FilmRepository filmRepository) {
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors() {
		return actorRepository.findAll();
	}
	@GetMapping("/findActor/{id}")
	public Actor getActorById(@PathVariable Integer id) {
		return actorRepository.findById(id).orElseThrow(() -> new ResourceAccessException("Actor not found at " + id));
	}
	@PostMapping("/addActor")
	public Actor createActor(@RequestBody Actor actor) {
		return actorRepository.save(actor);
	}
	@PutMapping("/putActor/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable(value = "id") Integer id, @RequestBody Actor actorDetails) {
		Actor Actor =  actorRepository.findById(id).orElseThrow(() -> new ResourceAccessException("Actor not found at " + id));;
		actorDetails.setActor_id(actorDetails.getActor_id());
		actorDetails.setLast_name(actorDetails.getLast_name());
		actorDetails.setFirst_name(actorDetails.getFirst_name());
		Actor updatedActor = actorRepository.save(actorDetails);
		return ResponseEntity.ok(updatedActor);
	}
	@DeleteMapping("/deleteActor/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer id){
		Actor Actor =  actorRepository.findById(id).orElseThrow(() -> new ResourceAccessException("Actor not found at " + id));
		actorRepository.delete(Actor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@GetMapping("/findFilmById/{id}")
	public Film getFilmById(@PathVariable Integer id) {
		return filmRepository.getFilmNum(id);
	}

	@GetMapping("/findFilmSales/{id}")
	public double getFilmSalesById(@PathVariable Integer id) {
		return filmRepository.getFilmSales(id);
	}


}
