package com.coding.challenge.pokemonapp.controller;

import com.coding.challenge.pokemonapp.model.dto.PokemonAbilityDto;
import com.coding.challenge.pokemonapp.model.dto.PokemonDto;
import com.coding.challenge.pokemonapp.model.mapper.DtoMapper;
import com.coding.challenge.pokemonapp.service.PokemonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/pokemon")
@RequiredArgsConstructor
public class PokemonController {

	private final PokemonService pokemonService;

	@GetMapping
	public ResponseEntity<PokemonDto> getPokemonById(
			@RequestParam(name = "id") Optional<Integer> id,
			@RequestParam(name = "name") Optional<String> name) {

		if (id.isPresent()) {
			log.info("Getting pokemon by id {}", id.get());
			return ResponseEntity.ok()
								 .body(DtoMapper.fromPokemonInfo(
										 pokemonService.getPokemonById(id.get())));
		} else if (name.isPresent()) {
			log.info("Getting pokemon by name {}", name.get());
			return ResponseEntity.ok()
								 .body(DtoMapper.fromPokemonInfo(
										 pokemonService.getPokemonByName(name.get())));

		}
		return ResponseEntity.badRequest().build();
	}

	@GetMapping("/abilities")
	public ResponseEntity<List<PokemonAbilityDto>> getAbilities(@RequestParam(name = "limit") Optional<Integer> limit) {
		log.info("Getting pokemon abilities");
		return ResponseEntity.ok().body(DtoMapper.fromPokemonAbilityList(pokemonService.getAbilities(limit.orElseGet(() -> 50))));
	}
}
