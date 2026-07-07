package com.cognizant.SpringWebDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Web!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

}