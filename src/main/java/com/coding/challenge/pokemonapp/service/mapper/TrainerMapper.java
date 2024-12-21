package com.coding.challenge.pokemonapp.service.mapper;

import com.coding.challenge.pokemonapp.model.entities.Trainer;
import com.coding.challenge.pokemonapp.model.entities.TrainerPokemons;
import com.coding.challenge.pokemonapp.model.entities.jpa.TrainerJpa;
import com.coding.challenge.pokemonapp.model.entities.jpa.TrainerPokemonsJpa;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TrainerMapper {

	public static Trainer fromTrainerJpa(final TrainerJpa trainerJpa) {
		return Trainer.builder()
					  .id(trainerJpa.getId())
					  .name(trainerJpa.getName())
					  .city(trainerJpa.getCity())
					  .score(trainerJpa.getScore())
					  .build();
	}

	public static TrainerJpa fromTrainer(final Trainer trainer) {
		return TrainerJpa.builder()
						 .id(trainer.getId())
						 .name(trainer.getName())
						 .city(trainer.getCity())
						 .score(trainer.getScore())
						 .build();
	}

	public static List<Trainer> fromTrainerJpaList(final List<TrainerJpa> trainerJpaList) {
		return trainerJpaList.stream()
							 .map(TrainerMapper::fromTrainerJpa)
							 .toList();
	}

	public static TrainerPokemons fromTrainerPokemonsJpa(final TrainerPokemonsJpa trainerPokemonsJpa) {
		return TrainerPokemons.builder()
							  .id(trainerPokemonsJpa.getId())
							  .idTrainer(trainerPokemonsJpa.getIdTrainer())
							  .idPokemon(trainerPokemonsJpa.getIdPokemon())
							  .build();
	}

	public static TrainerPokemonsJpa fromTrainerPokemons(final TrainerPokemons trainerPokemons) {
		return TrainerPokemonsJpa.builder()
									.id(trainerPokemons.getId())
									.idTrainer(trainerPokemons.getIdTrainer())
									.idPokemon(trainerPokemons.getIdPokemon())
									.build();
	}
}
