package com.coding.challenge.pokemonapp.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class TrainerDto {
	private Long id;
	private String name;
	private String city;
	private int score;

}
