package com.coding.challenge.pokemonapp.controller;

import com.coding.challenge.pokemonapp.model.dto.TrainerDto;
import com.coding.challenge.pokemonapp.model.mapper.DtoMapper;
import com.coding.challenge.pokemonapp.service.TrainerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/trainer")
@RequiredArgsConstructor
public class TrainerController {
	private final TrainerService trainerService;

	@GetMapping
	public ResponseEntity<?> getAll() {
		log.info("Getting all trainers");
		return ResponseEntity.ok().body(DtoMapper.fromTrainerList(trainerService.getTrainers()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		log.info("Getting trainer by id {}", id);
		return ResponseEntity.ok().body(DtoMapper.fromTrainer(trainerService.getTrainerById(id)));
	}


	@PostMapping
	public ResponseEntity<?> createTrainer(@RequestBody TrainerDto trainerDto) {
		log.info("Creating the trainer name {}", trainerDto.getName());
		return ResponseEntity.ok().body(DtoMapper.fromTrainer(trainerService.createTrainer(DtoMapper.fromTrainerDto(trainerDto))));
	}

	@PutMapping
	public ResponseEntity<?> updateTrainer(@RequestBody TrainerDto trainerDto) {
		log.info("Updating the trainer name {}", trainerDto.getName());
		return ResponseEntity.ok().body(DtoMapper.fromTrainer(trainerService.updateTrainer(DtoMapper.fromTrainerDto(trainerDto))));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTrainer(@PathVariable Long id) {
		log.info("Deleting the trainer id {}", id);
		trainerService.deleteTrainer(id);
		return ResponseEntity.ok().build();
	}


}
