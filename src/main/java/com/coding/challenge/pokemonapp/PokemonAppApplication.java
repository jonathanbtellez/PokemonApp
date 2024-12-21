package com.coding.challenge.pokemonapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.coding.challenge.pokemonapp.service.client"})
public class PokemonAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(PokemonAppApplication.class, args);
	}

}
