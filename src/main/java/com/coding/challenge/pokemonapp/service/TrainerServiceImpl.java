package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.exception.TrainerNotFoundException;
import com.coding.challenge.pokemonapp.model.entities.Trainer;
import com.coding.challenge.pokemonapp.model.entities.jpa.TrainerJpa;
import com.coding.challenge.pokemonapp.repository.TrainerRepository;
import com.coding.challenge.pokemonapp.service.mapper.TrainerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {

	private final TrainerRepository trainerRepository;


	@Override
	public Trainer createTrainer(Trainer trainer) {
		log.info("Creating the trainer name {}", trainer.getName());

		return TrainerMapper.fromTrainerJpa(trainerRepository.save(TrainerMapper.fromTrainer(trainer)));
	}

	@Override
	public Trainer getTrainerById(Long id) {

		return TrainerMapper.fromTrainerJpa(trainerRepository.findById(id).orElseThrow(
				() -> new TrainerNotFoundException(id.toString())));
	}

	@Override
	public Trainer updateTrainer(Trainer trainer) {

		return TrainerMapper.fromTrainerJpa(trainerRepository.findById(trainer.getId())
															 .map(trainerJpa -> {
																 trainerJpa.setName(trainer.getName());
																 trainerJpa.setCity(trainer.getCity());
																 trainerJpa.setScore(trainer.getScore());
																 return trainerRepository.save(trainerJpa);
															 })
															 .orElseThrow(() -> new TrainerNotFoundException(trainer.getId().toString())));

	}

	@Override
	public void deleteTrainer(Long id) {
		try {
			trainerRepository.deleteById(id);
		} catch (Exception e) {
			throw new TrainerNotFoundException(id.toString());
		}
	}

	@Override public List<Trainer> getTrainers() {
		return TrainerMapper.fromTrainerJpaList(trainerRepository.findAll());
	}

}
