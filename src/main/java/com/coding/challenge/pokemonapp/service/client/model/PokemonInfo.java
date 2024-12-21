package com.coding.challenge.pokemonapp.service.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Builder
@Getter
public class PokemonInfo {

	private List<Ability> abilities;
	private long baseExperience;
	private Cries cries;
	private List<Form> forms;
	private List<GameIndex> gameIndices;
	private long height;
	private List<HeldItem> heldItems;
	private long id;
	private boolean isDefault;
	private String locationAreaEncounters;
	private List<Move> moves;
	private String name;
	private long order;
	private Object[] pastAbilities;
	private List<Object> pastTypes;
	private Species species;
	private Sprites sprites;
	private List<Object> stats;
	private List<Object> types;
	private long weight;

}
