package com.coding.challenge.pokemonapp.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AbilityModel {

	private SpeciesModel ability;
	private boolean isHidden;
	private long slot;
}
