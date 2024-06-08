package idat.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import idat.edu.pe.Model.Service.UsuarioService;

@Controller
@RequestMapping("/Usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/listar")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.listarUsuario());
		return "/Usuarios/Usuarios";
	}
	
	
}

