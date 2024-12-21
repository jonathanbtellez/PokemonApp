package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.model.entities.Pokemon;
import com.coding.challenge.pokemonapp.model.entities.TrainerPokemons;

import java.util.List;

public interface TrainerPokemonService {
	TrainerPokemons addFavorite(TrainerPokemons trainerPokemons);
	List<Pokemon> getFavorites(Long id);
}


