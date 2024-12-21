package com.coding.challenge.pokemonapp.repository;

import com.coding.challenge.pokemonapp.model.entities.jpa.TrainerPokemonsJpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;




public interface TrainerPokemonsRepository extends JpaRepository<TrainerPokemonsJpa, Long> {
	List<TrainerPokemonsJpa> findByIdTrainer(Long id);
}