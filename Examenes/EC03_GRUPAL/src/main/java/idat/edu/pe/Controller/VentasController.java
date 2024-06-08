package idat.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Model.Service.ListaService;



	@Controller
	@RequestMapping("/Ventas")
	public class VentasController {
		
		@Autowired
		ListaService listS;
		
		@GetMapping("/ventax")
		public String venta(Model model) {
			model.addAttribute("ls",listS.listarVentas());

			return "Ventas/ventax";
		}

	
}
