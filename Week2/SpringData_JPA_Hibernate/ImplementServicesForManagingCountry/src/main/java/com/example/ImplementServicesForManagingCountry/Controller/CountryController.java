package com.example.ImplementServicesForManagingCountry.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ImplementServicesForManagingCountry.Entity.Country;
import com.example.ImplementServicesForManagingCountry.Service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
    
    // Find country by code
    @GetMapping("/{code}")
    public Country getAll(@PathVariable String code) {
        return countryService.getAll(code);
    }

    @PostMapping
    public Country Add(@RequestBody Country country) {
        return countryService.Add(country);
    }

    @PutMapping
    public Country Update(@RequestBody Country country) {
        return countryService.Update(country);
    }

    @DeleteMapping("/{code}")
    public String Delete(@PathVariable String code) {
        countryService.Delete(code);
        return "Country Deleted Successfully";
    }


    @GetMapping("/search/{name}")
    public List<Country> Search(@PathVariable String name) {
        return countryService.Search(name);
    }
}