package com.gherard.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gherard.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
