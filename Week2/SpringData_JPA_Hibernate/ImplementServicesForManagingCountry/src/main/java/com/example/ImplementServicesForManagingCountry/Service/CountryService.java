package com.example.ImplementServicesForManagingCountry.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ImplementServicesForManagingCountry.Entity.Country;
import com.example.ImplementServicesForManagingCountry.Repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country getAll(String code) {
        Optional<Country> country = countryRepository.findById(code);
        return country.orElse(null);
    }
    
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country Add(Country country) {
        return countryRepository.save(country);
    }

    public Country Update(Country country) {
        return countryRepository.save(country);
    }

    public void Delete(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> Search(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }

}