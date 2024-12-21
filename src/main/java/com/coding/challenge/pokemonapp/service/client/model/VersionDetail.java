package com.coding.challenge.pokemonapp.service.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class VersionDetail {

	private long rarity;
	private Species version;

}
