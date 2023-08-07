package idat.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Model.Service.ProductoServicio;

@Controller
@RequestMapping("/Productos")
public class ProductosController {
	
	@Autowired
	ProductoServicio productoServicio;
	
	@GetMapping("/listar")
	public String productos(Model model) {
		model.addAttribute("htproductos", productoServicio.listarProductos());
		return "/Productos/Productos";
	}
}
	
