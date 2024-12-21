package com.coding.challenge.pokemonapp.model.mapper;

import com.coding.challenge.pokemonapp.model.dto.AbilityDto;
import com.coding.challenge.pokemonapp.model.dto.FormDto;
import com.coding.challenge.pokemonapp.model.dto.PokemonAbilityDto;
import com.coding.challenge.pokemonapp.model.dto.PokemonDto;
import com.coding.challenge.pokemonapp.model.dto.SpeciesDto;
import com.coding.challenge.pokemonapp.model.dto.TrainerDto;
import com.coding.challenge.pokemonapp.model.dto.TrainerPokemonsDto;
import com.coding.challenge.pokemonapp.model.entities.AbilityModel;
import com.coding.challenge.pokemonapp.model.entities.FormModel;
import com.coding.challenge.pokemonapp.model.entities.Pokemon;
import com.coding.challenge.pokemonapp.model.entities.PokemonAbility;
import com.coding.challenge.pokemonapp.model.entities.SpeciesModel;
import com.coding.challenge.pokemonapp.model.entities.Trainer;
import com.coding.challenge.pokemonapp.model.entities.TrainerPokemons;

import java.util.List;

public class DtoMapper {

	public static PokemonDto fromPokemonInfo(final Pokemon pokemonInfo) {

		return PokemonDto.builder()
						 .name(pokemonInfo.getName())
						 .forms(fromFormsInfo(pokemonInfo.getForms()))
						 .height(pokemonInfo.getHeight())
						 .weight(pokemonInfo.getWeight())
						 .species(fromSpeciesInfo(pokemonInfo.getSpecies()))
						 .ability(fromAbilityList(pokemonInfo.getAbility()))
						 .build();
	}

	public static List<PokemonDto> fromPokemonList(final List<Pokemon> pokemonList) {

		return pokemonList.stream()
							  .map(DtoMapper::fromPokemonInfo)
							  .toList();
	}

	public static SpeciesDto fromSpeciesInfo(final SpeciesModel species) {

		return SpeciesDto.builder()
						 .name(species.getName())
						 .url(species.getUrl())
						 .build();
	}

	public static List<FormDto> fromFormsInfo(final List<FormModel> formsList) {

		return formsList.stream()
						.map(form -> FormDto.builder()
											.name(form.getName())
											.url(form.getUrl())
											.build())
						.toList();
	}

	public static List<AbilityDto> fromAbilityList(final List<AbilityModel> abilities) {

		return abilities.stream()
						.map(ability -> AbilityDto.builder()
												  .ability(fromSpeciesInfo(ability.getAbility()))
												  .isHidden(ability.isHidden())
												  .slot(ability.getSlot())
												  .build())
						.toList();
	}

	public static List<PokemonAbilityDto> fromPokemonAbilityList(
			final List<PokemonAbility> pokemonAbilityList) {

		return pokemonAbilityList.stream()
								 .map(ability -> PokemonAbilityDto.builder()
																  .name(ability.getName())
																  .url(ability.getUrl())
																  .build())
								 .toList();
	}

	public static TrainerDto fromTrainer(final Trainer trainer) {

		return TrainerDto.builder()
						 .name(trainer.getName())
						 .score(trainer.getScore())
						 .city(trainer.getCity())
						 .id(trainer.getId())
						 .build();
	}

	public static Trainer fromTrainerDto(final TrainerDto trainerDto) {

		return Trainer.builder()
					  .name(trainerDto.getName())
					  .score(trainerDto.getScore())
					  .city(trainerDto.getCity())
					  .id(trainerDto.getId())
					  .build();
	}

	public static List<TrainerDto> fromTrainerList(final List<Trainer> trainerList) {
		return trainerList.stream()
						  .map(DtoMapper::fromTrainer)
						  .toList();
	}


	public static TrainerPokemonsDto fromTrainerPokemons(final TrainerPokemons trainerPokemons) {
		return TrainerPokemonsDto.builder()
								  .id(trainerPokemons.getId())
								  .idTrainer(trainerPokemons.getIdTrainer())
								  .idPokemon(trainerPokemons.getIdPokemon())
								  .build();
	}

	public static TrainerPokemons fromTrainerPokemonsDto(final TrainerPokemonsDto trainerPokemonsDto) {
		return TrainerPokemons.builder()
							  .id(trainerPokemonsDto.getId())
							  .idTrainer(trainerPokemonsDto.getIdTrainer())
							  .idPokemon(trainerPokemonsDto.getIdPokemon())
							  .build();
	}
}
