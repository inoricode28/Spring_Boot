package com.idat.semana02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.semana02.model.Persona;
import com.idat.semana02.service.IPersonaService;


@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public List<Persona> listar()
	{
		return service.listar();
	}
	
	@GetMapping("/buscar/{id}")
	public Persona buscar(@PathVariable("id") Long id) {
		return service.buscar(id);
	}
	
	@GetMapping("/pagina")
	public Page<Persona> listarPagina(Pageable pagina){
		return service.listarPagina(pagina);
	}
	
	@PostMapping
	public ResponseEntity<Persona> registrar(@RequestBody Persona p){
		Persona pN=service.registrar(p);
		return new ResponseEntity<Persona>(pN, HttpStatus.CREATED);
	}
	
	@PutMapping
	public Persona modificar( @RequestBody Persona p) {
		return service.modificar(p);
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable("id") Long id) {
		return service.eliminar(id);
	}
	
	
	// Semana03
	
	@GetMapping("/buscarNA")
	public List<Persona> listarNA(String nombres, String apellidos)
	{
		List<Persona> lst=service.buscarNombreApellido(nombres, apellidos);
		return lst;
	}

	@GetMapping("/listarHql")
	public List<Persona> listarHql(Long id){
		return service.listarPersonaHql(id);
	}
	
	@GetMapping("/listarNativo")
	public List<Persona> listarNativo(){
		return service.listarPersonaNativo();
	}
	
	@GetMapping("/listarProc")
	public List<Persona> listarProc(Long id){
		return service.listarPersonaProc(id);
	}
	
}
