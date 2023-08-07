package idat.edu.pe.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Model.CategoriaForm;
import idat.edu.pe.Model.Repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public List<CategoriaForm> listarCategoria(){
		return categoriaRepository.findAll();
	}	
	

}
