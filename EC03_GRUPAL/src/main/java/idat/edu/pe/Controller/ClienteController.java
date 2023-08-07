package idat.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Model.Service.ClienteService;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {	

	@Autowired
	ClienteService clienteService;

	@GetMapping("/listar")
	public String usuarios(Model model) {
		model.addAttribute("cliente", clienteService.listarCliente());
		return "/Cliente/Cliente";
	}
	

}
