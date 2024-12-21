package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.model.entities.Pokemon;
import com.coding.challenge.pokemonapp.model.entities.TrainerPokemons;
import com.coding.challenge.pokemonapp.repository.TrainerPokemonsRepository;
import com.coding.challenge.pokemonapp.repository.TrainerRepository;
import com.coding.challenge.pokemonapp.service.mapper.TrainerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainerPokemonServiceImpl implements  TrainerPokemonService {

	private final TrainerPokemonsRepository trainerPokemonsRepository;
	private final TrainerRepository trainerRepository;
	private final PokemonService pokemonService;
	@Override public TrainerPokemons addFavorite(TrainerPokemons trainerPokemons) {
		trainerRepository.findById(trainerPokemons.getIdTrainer())
						.orElseThrow(() -> new RuntimeException("Trainer not found"));

		return TrainerMapper.fromTrainerPokemonsJpa(
				trainerPokemonsRepository.save(TrainerMapper.fromTrainerPokemons(trainerPokemons)));
	}

	@Override
	public List<Pokemon> getFavorites(Long id) {
		return trainerPokemonsRepository.findByIdTrainer(id).stream().map(trainerPokemonsJpa -> {
			return pokemonService.getPokemonById(trainerPokemonsJpa.getIdPokemon());
		}).toList();
	}
}


