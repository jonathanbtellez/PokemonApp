package com.coding.challenge.pokemonapp.service.client;

import com.coding.challenge.pokemonapp.service.client.model.AbilityInfo;
import com.coding.challenge.pokemonapp.service.client.model.PokemonInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokemonApi", url = "${pokemon.api.url}")
public interface PokemonFeignClient {

	@GetMapping(value="/pokemon/{name}", consumes = "application/json")
	PokemonInfo getPokemonInfoByName(@PathVariable("name") String name);

	@GetMapping(value="/pokemon/{id}", consumes = "application/json")
	PokemonInfo getPokemonInfoById(@PathVariable("id") int id);

	@GetMapping(value="/ability?limit={limit}", consumes = "application/json")
	AbilityInfo getAbilities(@PathVariable("limit") int limit);
}
