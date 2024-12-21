package com.coding.challenge.pokemonapp.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class SpeciesDto {

	private String name;
	private String url;
}
