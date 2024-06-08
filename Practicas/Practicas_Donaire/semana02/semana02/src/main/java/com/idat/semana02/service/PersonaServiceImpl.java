package com.idat.semana02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.idat.semana02.dao.IPersonaDao;
import com.idat.semana02.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDao dao;
	
	@Override
	public Persona registrar(Persona p) {
		p.setIdPersona(0L);
		return dao.save(p);
	}

	@Override
	public Persona modificar(Persona p) {
		return dao.save(p);
	}

	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

	@Override
	public Persona buscar(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public boolean eliminar(Long id) {
		Optional<Persona> opt=dao.findById(id);
		if (opt!=null) {
			dao.delete(opt.get());
			return true;
		}
		return false;
	}

	@Override
	public Page<Persona> listarPagina(Pageable pagina) {
		return dao.findAll(pagina);
	}

}
