package com.example.ORM_Learn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ORM_Learn.Model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>{

}