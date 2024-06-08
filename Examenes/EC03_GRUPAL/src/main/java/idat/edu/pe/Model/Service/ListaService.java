package idat.edu.pe.Model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import idat.edu.pe.Model.VentasForm;
import idat.edu.pe.Model.Repository.Lista;

import java.util.List;


@Service
public class ListaService {
	
	@Autowired
	Lista varList;
	
	
	public List<VentasForm> listarVentas(){
		return varList.findAll();
		
	}

}
