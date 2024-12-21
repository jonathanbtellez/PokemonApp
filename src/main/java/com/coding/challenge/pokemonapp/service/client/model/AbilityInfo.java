package com.coding.challenge.pokemonapp.service.client.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class AbilityInfo {

	private long count;
	private String next;
	private Object previous;
	private List<PokemonAbilityInfo> results;

}
