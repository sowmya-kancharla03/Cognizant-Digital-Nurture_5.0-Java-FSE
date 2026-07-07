package com.cognizant.CountryService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.CountryService.model.Country;
import com.cognizant.CountryService.service.CountryService;

@RestController
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    public Country getCountry() {
        return countryService.getCountry();
    }
}