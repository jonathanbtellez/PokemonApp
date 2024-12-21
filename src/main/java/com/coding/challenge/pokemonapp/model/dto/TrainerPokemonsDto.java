package com.coding.challenge.pokemonapp.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TrainerPokemonsDto {
	private Long id;
	private Long idTrainer;
	private int idPokemon;
}
