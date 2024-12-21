package com.coding.challenge.pokemonapp.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class SpeciesModel {

	private String name;
	private String url;
}
