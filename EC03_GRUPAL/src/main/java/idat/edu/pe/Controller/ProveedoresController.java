package idat.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Model.Service.ProveedoresService;

@Controller
@RequestMapping("/Proveedores")
public class ProveedoresController {
	
	
	@Autowired
	ProveedoresService proveedoresService;

	@GetMapping("/listar")
	public String usuarios(Model model) {
		model.addAttribute("proveedores", proveedoresService.listarProveedores());
		return "/Proveedores/Proveedores";
	}	

}
