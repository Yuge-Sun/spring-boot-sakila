package com.Sakila.Sakila;

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
	public actorRepository actorRepository;
	public filmRepository filmRepository;
	public SakilaApplication(actorRepository actorRepository, filmRepository filmRepository) {
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<actor> getAllActors() {
		return actorRepository.findAll();
	}
	@GetMapping("/findActor/{id}")
	public actor getActorById(@PathVariable Integer id) {
		return actorRepository.findById(id).orElseThrow(() -> new ResourceAccessException("Actor not found at " + id));
	}
	@PostMapping("/addActor")
	public actor createActor(@RequestBody actor actor) {
		return actorRepository.save(actor);
	}
	@PutMapping("/putActor/{id}")
	public ResponseEntity<actor> updateActor(@PathVariable(value = "id") Integer id, @RequestBody actor actorDetails) {
		Optional<actor> optionalActor =  actorRepository.findById(id);
		actor actor = optionalActor.get();
		actorDetails.setActor_id(actorDetails.getActor_id());
		actorDetails.setLast_name(actorDetails.getLast_name());
		actorDetails.setFirst_name(actorDetails.getFirst_name());
		actor updatedActor = actorRepository.save(actorDetails);
		return ResponseEntity.ok(updatedActor);
	}
	@DeleteMapping("/deleteActor/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer id){
		Optional<actor> optionalActor =  actorRepository.findById(id);
		actor actor = optionalActor.get();
		actorRepository.delete(actor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<film> getAllFilms() {
		return filmRepository.findAll();
	}

	@GetMapping("/findFilmById/{id}")
	public film getFilmById(@PathVariable Integer id) {
		return filmRepository.getFilmNum(id);
	}

	@GetMapping("/findFilmSales/{id}")
	public double getFilmSalesById(@PathVariable Integer id) {
		return filmRepository.getFilmSales(id);
	}


}
