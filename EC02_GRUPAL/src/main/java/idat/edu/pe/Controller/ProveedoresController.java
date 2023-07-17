package idat.edu.pe.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import idat.edu.pe.Model.ProveedoresForm;

@Controller
public class ProveedoresController {
	List<ProveedoresForm> lstProvee = new ArrayList<>();

	@GetMapping("Proveedores/Proveedores")
	public ModelAndView Proveedores() {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("proveedoresform", new ProveedoresForm());
		return modelView;
	}

	@PostMapping("/Proveedores")
	public String Proveedores(@ModelAttribute("proveedoresform") ProveedoresForm ProveeForm, Model model) {

		ProveedoresForm provee = new ProveedoresForm(ProveeForm.getCodRUC(), ProveeForm.getNombre(), ProveeForm.getDireccion(),
				ProveeForm.getRazon(), ProveeForm.getFechFactu());
		lstProvee.add(provee);

		model.addAttribute("lstProvee", lstProvee);
		return "Proveedores/Proveedores";
	}

}
