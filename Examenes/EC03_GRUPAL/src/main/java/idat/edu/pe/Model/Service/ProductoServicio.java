package idat.edu.pe.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Model.ProductosForm;
import idat.edu.pe.Model.Repository.ProductosRepository;

@Service
public class ProductoServicio {
	
	@Autowired
	ProductosRepository productoRepository;
	
	public List<ProductosForm> listarProductos(){
		return productoRepository.findAll();
		
	}

}
