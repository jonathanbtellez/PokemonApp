package com.coding.challenge.pokemonapp.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TrainerPokemons {
	private Long id;
	private Long idTrainer;
	private int idPokemon;
}
