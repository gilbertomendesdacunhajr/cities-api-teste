package com.github.gilbertomendesdacunhajr.citiesapi.countries.repository;

import com.github.gilbertomendesdacunhajr.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long>{
}
