package com.coding.challenge.pokemonapp.service;

import com.coding.challenge.pokemonapp.model.entities.Login;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Slf4j
@Service
public class AuthServiceImpl implements  AuthService{

    @Value("${pokemon_app.jwt.secret}")
    private String secret;

    @Value("${pokemon_app.jwt.expiration}")
    private String expiration;


    public String login(Login login) {
        return generateJwtToken(login.getUsername());
    }

    public void reqister(String username, String password) {
        System.out.println("register");
    }

    private String generateJwtToken(String username) {
        log.info("{}", secret);
        SecretKey SECRET_KEY = Keys.hmacShaKeyFor(secret.getBytes());
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + Integer.parseUnsignedInt(expiration)))
                .signWith(SECRET_KEY)
                .compact();
    }
}
