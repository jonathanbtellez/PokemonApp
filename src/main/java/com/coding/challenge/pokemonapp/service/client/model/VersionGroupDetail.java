package com.coding.challenge.pokemonapp.service.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class VersionGroupDetail {

	private long levelLearnedAt;
	private Species moveLearnMethod;
	private Species versionGroup;

}
