package com.sample.CountryCodeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.CountryCodeService.model.Country;
import com.sample.CountryCodeService.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {

        return countryService.getCountryByCode(code);

    }

}