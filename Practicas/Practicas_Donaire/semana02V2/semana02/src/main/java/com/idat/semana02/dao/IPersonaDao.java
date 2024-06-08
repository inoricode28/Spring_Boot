package com.idat.semana02.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idat.semana02.model.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

	// Semana - 03
	
	List<Persona> findByNombresAndApellidos(String nombres,String apellidos);
	
	@Query(value = "from Persona p where p.idPersona=:id_persona")
	List<Persona> listarPersonaHql(@Param("id_persona") Long id);
	
	@Query(value = "Select id_persona,apellidos,nombres from tbl_persona", nativeQuery = true)
	List<Object[]> listarPersonaNativo();
	
	@Query(value = "Select * from fnc_listar(?1)", nativeQuery = true)  //Postgres
	//@Query(value = "call listaPersona(?1)", nativeQuery = true)  //MySQL
	List<Object[]> listarPersonaProc(Long id);
	

	
}
