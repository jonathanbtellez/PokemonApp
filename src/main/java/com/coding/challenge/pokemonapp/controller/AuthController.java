package com.coding.challenge.pokemonapp.controller;


import com.coding.challenge.pokemonapp.model.dto.LoginDto;
import com.coding.challenge.pokemonapp.model.entities.Login;
import com.coding.challenge.pokemonapp.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(authService.login(Login.builder()
                .username(loginDto.getUsername())
                .password(loginDto.getPassword())
                .build()));
    }
}
