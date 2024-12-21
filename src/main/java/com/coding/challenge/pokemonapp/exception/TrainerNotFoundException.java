package com.coding.challenge.pokemonapp.exception;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TrainerNotFoundException extends RuntimeException {

	private static final String MESSAGE_PREFIX = "Trainer not found with id %s";

	public TrainerNotFoundException(String message) {

		super(String.format(MESSAGE_PREFIX, message));
		log.error(String.format(MESSAGE_PREFIX, message));

	}
}
