package com.coding.challenge.pokemonapp.service.client.mapper;

import com.coding.challenge.pokemonapp.model.entities.AbilityModel;
import com.coding.challenge.pokemonapp.model.entities.FormModel;
import com.coding.challenge.pokemonapp.model.entities.Pokemon;
import com.coding.challenge.pokemonapp.model.entities.PokemonAbility;
import com.coding.challenge.pokemonapp.model.entities.SpeciesModel;
import com.coding.challenge.pokemonapp.service.client.model.Ability;
import com.coding.challenge.pokemonapp.service.client.model.AbilityInfo;
import com.coding.challenge.pokemonapp.service.client.model.Form;
import com.coding.challenge.pokemonapp.service.client.model.PokemonInfo;
import com.coding.challenge.pokemonapp.service.client.model.Species;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientMapper {

	public static Pokemon fromPokemonInfo(final PokemonInfo pokemonInfo) {

		return Pokemon.builder()
					  .name(pokemonInfo.getName())
					  .forms(fromFormList(pokemonInfo.getForms()))
					  .height(pokemonInfo.getHeight())
					  .weight(pokemonInfo.getWeight())
					  .species(fromSpeciesInfo(pokemonInfo.getSpecies()))
					  .ability(fromAbilityList(pokemonInfo.getAbilities()))
					  .build();
	}

	public static SpeciesModel fromSpeciesInfo(final Species species) {

		return SpeciesModel.builder()
						   .name(species.getName())
						   .url(species.getUrl())
						   .build();
	}

	public static List<AbilityModel> fromAbilityList(final List<Ability> abilities) {

		return abilities.stream()
						.map(ability -> AbilityModel.builder()
													.ability(fromSpeciesInfo(ability.getAbility()))
													.isHidden(ability.isHidden())
													.slot(ability.getSlot())
													.build())
						.toList();
	}

	public static List<FormModel> fromFormList(final List<Form> formsList) {

		return formsList.stream()
						.map(form -> FormModel.builder()
											  .name(form.getName())
											  .url(form.getUrl())
											  .build())
						.toList();
	}

	public static List<PokemonAbility> fromPokemonAbilityInfoList(final AbilityInfo abilityInfo) {

		return abilityInfo.getResults().stream()
						  .map(ability -> PokemonAbility.builder()
														.name(ability.getName())
														.url(ability.getUrl())
														.build())
						  .toList();
	}

}
