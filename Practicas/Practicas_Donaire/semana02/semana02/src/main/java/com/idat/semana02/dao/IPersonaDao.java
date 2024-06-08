package com.idat.semana02.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.semana02.model.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

}
