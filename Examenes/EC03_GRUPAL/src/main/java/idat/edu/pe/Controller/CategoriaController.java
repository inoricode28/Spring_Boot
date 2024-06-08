package idat.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import idat.edu.pe.Model.Service.CategoriaService;

@Controller
@RequestMapping("/Categoria")
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;

	@GetMapping("/listar")
	public String categoria(Model model) {
		model.addAttribute("categorias", categoriaService.listarCategoria());
		return "/Categoria/Categoria";
	}
	
	
}
