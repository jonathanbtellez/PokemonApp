package com.coding.challenge.pokemonapp.service.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Sprites {

	private String backDefault;
	private Object backFemale;
	private String backShiny;
	private Object backShinyFemale;
	private String frontDefault;
	private Object frontFemale;
	private String frontShiny;
	private Object frontShinyFemale;
	private Object other;
	private Object versions;
	private Sprites animated;

}
