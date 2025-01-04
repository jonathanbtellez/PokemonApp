package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.model.entities.Login;

public interface AuthService {
    String login(Login login);

    void reqister(String username, String password);
}
