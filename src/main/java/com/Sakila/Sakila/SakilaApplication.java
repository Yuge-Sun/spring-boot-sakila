package com.Sakila.Sakila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin

public class SakilaApplication {

	@Autowired
	private actorRepository actorRepository;
	public SakilaApplication(actorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<actor> getAllActors() {
		return actorRepository.findAll();
	}
	@GetMapping("/find/{id}")
	public Optional<actor> getActorById(@PathVariable Integer id) {
		return actorRepository.findById(id);
	}
	@PostMapping("/actors")
	public actor createActor(@RequestBody actor actor) {
		return actorRepository.save(actor);
	}

}
