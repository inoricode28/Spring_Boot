package idat.edu.pe.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import idat.edu.pe.Model.ProductosForm;

@Controller
public class ProductosController {
	List<ProductosForm> lstProd = new ArrayList<>();

	@GetMapping("Productos/Productos")
	public ModelAndView Productos() {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("productoform", new ProductosForm());
		return modelView;
	}

	private int contadorProducto = 1;

	@PostMapping("/Productos")
	public String Productos(@ModelAttribute("productosform") ProductosForm ProductForm, Model model) {

		String idProductos = "P" + String.format("%04d", contadorProducto);
		ProductosForm prod = new ProductosForm(idProductos, ProductForm.getNombre(), ProductForm.getStock(),
				ProductForm.getPrecio(), ProductForm.getProveedor());
		lstProd.add(prod);
		contadorProducto++;
		model.addAttribute("lstProd", lstProd);
		return "Productos/Productos";
	}

}
