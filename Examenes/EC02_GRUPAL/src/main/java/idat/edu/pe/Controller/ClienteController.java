package idat.edu.pe.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import idat.edu.pe.Model.ClienteForm;


@Controller
public class ClienteController {
	List<ClienteForm> lstcliente = new ArrayList<>();

	@GetMapping("Cliente/Cliente")
	public ModelAndView Cliente() {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("clienteform", new ClienteForm());
		return modelView;
	}
	
	private int contadorCliente = 1;

	@PostMapping("/Cliente")
	public String Cliente(@ModelAttribute("clienteform") ClienteForm  Varclient, Model model) {

		String idClient  = "C" + String.format("%04d", contadorCliente);
		ClienteForm  client = new ClienteForm (idClient, Varclient.getNombre(), Varclient.getTelefono(), Varclient.getDireccion(), Varclient.getRazon());
		lstcliente.add(client);
		contadorCliente++;
		model.addAttribute("lstcliente", lstcliente);
		return "Cliente/Cliente";
	}

	

}
