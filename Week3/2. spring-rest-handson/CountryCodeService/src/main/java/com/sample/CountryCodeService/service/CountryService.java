package com.sample.CountryCodeService.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.sample.CountryCodeService.model.Country;

@Service
public class CountryService {

    private List<Country> countries = new ArrayList<>();

    public CountryService() {

        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
        countries.add(new Country("AU", "Australia"));
        countries.add(new Country("CA", "Canada"));

    }

    public Country getCountryByCode(String code) {

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }

}