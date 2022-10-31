package com.Sakila.Sakila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
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
	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer id){
		Optional<actor> optionalActor =  actorRepository.findById(id);
		actor actor = optionalActor.get();
		actorRepository.delete(actor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}



}
