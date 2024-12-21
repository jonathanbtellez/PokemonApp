package com.coding.challenge.pokemonapp.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder
public class AbilityDto {

	private SpeciesDto ability;
	private boolean isHidden;
	private long slot;
}
