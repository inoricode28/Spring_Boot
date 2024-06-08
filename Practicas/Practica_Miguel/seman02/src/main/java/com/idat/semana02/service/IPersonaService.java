package com.idat.semana02.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.idat.semana02.model.Persona;

public interface IPersonaService {

	Persona registrar(Persona p);
	
	Persona modificar(Persona p);
	
	List<Persona> listar();
	
	Persona buscar(Long id);
	
	boolean eliminar(Long id);
	
	Page<Persona> listarPagina(Pageable pagina);
	
	//Semana03
	
	List<Persona> buscarNombreApellido(String nombres, String apellidos);
	
	List<Persona> listarPersonaHql(Long id);

	List<Persona> listarPersonaNativo();

	List<Persona> listarPersonaProc(Long id);

	
}
