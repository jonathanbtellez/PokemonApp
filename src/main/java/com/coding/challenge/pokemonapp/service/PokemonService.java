package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.model.entities.Pokemon;
import com.coding.challenge.pokemonapp.model.entities.PokemonAbility;
import java.util.List;

public interface PokemonService {

	Pokemon getPokemonByName(String name);

	Pokemon getPokemonById(int id);

	List<PokemonAbility> getAbilities(int limit);


}
