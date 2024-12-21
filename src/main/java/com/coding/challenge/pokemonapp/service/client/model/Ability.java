package com.coding.challenge.pokemonapp.service.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Builder
@Getter
public class Ability {
	private Species ability;
	private boolean isHidden;
	private long slot;
}
