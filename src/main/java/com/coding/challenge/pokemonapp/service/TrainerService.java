package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.model.entities.Trainer;

import java.util.List;

public interface TrainerService {
	Trainer createTrainer(Trainer trainer);
	Trainer getTrainerById(Long id);
	Trainer updateTrainer(Trainer trainer);
	void deleteTrainer(Long id);
	List<Trainer> getTrainers();
}
