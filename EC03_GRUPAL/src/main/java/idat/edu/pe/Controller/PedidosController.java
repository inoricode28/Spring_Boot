package idat.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Model.Service.*;


@Controller
@RequestMapping("/Pedidos")

public class PedidosController {
	
	@Autowired
	PedidoService pedService;
	
	@GetMapping("/frmListarPedidos")
	public String frmListarPedidos(Model model) {
		model.addAttribute("lstPedidos",pedService.listarPedidos());

        return "Pedidos/frmListarPedidos";

    }

}
