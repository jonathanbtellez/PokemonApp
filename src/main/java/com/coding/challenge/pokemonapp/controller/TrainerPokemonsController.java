package com.coding.challenge.pokemonapp.controller;

import com.coding.challenge.pokemonapp.model.dto.TrainerPokemonsDto;
import com.coding.challenge.pokemonapp.model.mapper.DtoMapper;
import com.coding.challenge.pokemonapp.service.TrainerPokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/trainer-pokemons")
@RequiredArgsConstructor
public class TrainerPokemonsController {

	private final TrainerPokemonService trainerPokemonService;

	@PostMapping
	public ResponseEntity<?> addFavorite(@RequestBody TrainerPokemonsDto trainerPokemonsDto) {

		return ResponseEntity.ok().body(DtoMapper.fromTrainerPokemons(
				trainerPokemonService.addFavorite(
						DtoMapper.fromTrainerPokemonsDto(trainerPokemonsDto))));

	}

	@GetMapping("{id}")
	public ResponseEntity<?> getFavorites(
			@PathVariable
			Long id) {

		return ResponseEntity.ok().body(DtoMapper.fromPokemonList(
				trainerPokemonService.getFavorites(id)));
	}
}
