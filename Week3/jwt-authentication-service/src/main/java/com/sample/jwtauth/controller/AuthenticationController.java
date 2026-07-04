package com.sample.jwtauth.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.sample.jwtauth.model.AuthenticationResponse;
import com.sample.jwtauth.util.JwtUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        String base64Credentials = authorizationHeader.substring(6);

        byte[] decodedBytes =
                Base64.getDecoder().decode(base64Credentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values = credentials.split(":", 2);

        String username = values[0];

        String token = JwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}