package com.coding.challenge.pokemonapp.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class PokemonDto {

	private String name;
	private SpeciesDto species;
	private List<AbilityDto> ability;
	private List<FormDto> forms;
	private double height;
	private double weight;

}
