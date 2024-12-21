package com.coding.challenge.pokemonapp.repository;

import com.coding.challenge.pokemonapp.model.entities.jpa.TrainerJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<TrainerJpa, Long> {
}