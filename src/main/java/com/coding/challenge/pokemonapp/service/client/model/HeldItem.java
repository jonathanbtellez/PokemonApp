package com.coding.challenge.pokemonapp.service.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class HeldItem {

	private Species item;
	private List<VersionDetail> versionDetails;

}
