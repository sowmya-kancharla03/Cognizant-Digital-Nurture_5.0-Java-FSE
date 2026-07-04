package com.sample.jwtauth.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class JwtFilter extends OncePerRequestFilter {

    private static final String SECRET =
            "mysecretkeymysecretkeymysecretkey12";

    private static final Key KEY =
            new SecretKeySpec(
                    SECRET.getBytes(),
                    "HmacSHA256");

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");

        String token = null;
        String username = null;

        // Step 1: Extract token
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7);
        }

        // Step 2: Validate token
        if (token != null) {
            try {
                Claims claims = Jwts.parserBuilder()
                        .setSigningKey(KEY)
                        .build()
                        .parseClaimsJws(token)
                        .getBody();

                username = claims.getSubject();

                System.out.println("JWT Verified for user: " + username);

            } catch (Exception e) {
                System.out.println("Invalid JWT Token");
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                return;
            }
        }

        filterChain.doFilter(request, response);
    }
}