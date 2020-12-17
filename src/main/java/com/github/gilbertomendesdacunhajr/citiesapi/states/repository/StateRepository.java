package com.github.gilbertomendesdacunhajr.citiesapi.states.repository;

import com.github.gilbertomendesdacunhajr.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
