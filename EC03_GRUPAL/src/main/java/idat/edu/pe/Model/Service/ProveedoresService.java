package idat.edu.pe.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Model.ProveedoresForm;
import idat.edu.pe.Model.Repository.ProveedoresRepository;

@Service
public class ProveedoresService {
	@Autowired
	ProveedoresRepository proveedoresRepository;
	
	public List<ProveedoresForm> listarProveedores(){
		return proveedoresRepository.findAll();
	}	
	
}
