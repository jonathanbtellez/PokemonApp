package com.coding.challenge.pokemonapp.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@Builder
public class Pokemon {

	private String name;
	private SpeciesModel species;
	private List<AbilityModel> ability;
	private List<FormModel> forms;
	private double height;
	private double weight;

}
