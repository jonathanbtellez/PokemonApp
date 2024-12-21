package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.model.entities.Pokemon;
import com.coding.challenge.pokemonapp.model.entities.PokemonAbility;
import com.coding.challenge.pokemonapp.service.client.PokemonFeignClient;
import com.coding.challenge.pokemonapp.service.client.mapper.ClientMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

	private final PokemonFeignClient pokemonClient;

	@Override public Pokemon getPokemonByName(String name) {
		return ClientMapper.fromPokemonInfo(pokemonClient.getPokemonInfoByName(name));
	}

	@Override public Pokemon getPokemonById(int id) {

		return ClientMapper.fromPokemonInfo(pokemonClient.getPokemonInfoById(id));
	}

	@Override public List<PokemonAbility> getAbilities(int limit) {

		return ClientMapper.fromPokemonAbilityInfoList(pokemonClient.getAbilities(limit)).stream()
						   .sorted((a, b) -> a.getName().compareTo(b.getName())).toList();
	}
}
