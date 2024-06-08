package idat.edu.pe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import idat.edu.pe.Model.VentasForm;

@Controller
public class VentasController {

	@GetMapping("Ventas/ventax")
	public ModelAndView ventas() {
		ModelAndView MV = new ModelAndView();
		MV.addObject("vent001", new VentasForm());
		MV.addObject("visual", false);
		return MV;
	}

	@PostMapping("/ventax")
	public String venti(@ModelAttribute("vent001") VentasForm vt, Model md) {
		// Traer los valore
		double idd = vt.getID();
		double code = vt.getCodigo();
		String pro = vt.getProducto();
		double preu = vt.getPrecioU();
		double ct = vt.getCant();
		double resultado = preu * ct;

		String visualizar = "true";
		String resultadoString = "Resumen de Venta:--- ID de Cliente" + idd + " Código Producto: " + code
				+ ", Producto: "
				+ pro + ", Precio Unitario: " + preu + ", Cantidad: " + ct + ", Importe a Pagar: S/" + resultado;

		md.addAttribute("visual", visualizar);
		md.addAttribute("R", resultadoString);

		return "Ventas/ventax";
	}

}
