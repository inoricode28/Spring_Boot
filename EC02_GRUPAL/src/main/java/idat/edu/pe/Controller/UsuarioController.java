package idat.edu.pe.Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import idat.edu.pe.Model.UsuarioForm;



@Controller
public class UsuarioController {
	
	List<UsuarioForm> lstUsers = new ArrayList<>();
	
	@GetMapping("Usuarios/Usuarios")
	public ModelAndView login() {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("usuarioform", new UsuarioForm());		
		return modelView;
	}
	
	private int contadorUsuarios = 1;
	
	@PostMapping("/Usuarios")
	public String Usuarios(@ModelAttribute("usuarioform") UsuarioForm loginForm,Model model) {
		
		String idUsuario = "A" + String.format("%04d", contadorUsuarios);		
		UsuarioForm user = new UsuarioForm(idUsuario, loginForm.getEmail(), loginForm.getContrasenia());
		lstUsers.add(user);
		contadorUsuarios++;
		model.addAttribute("lstUsers",lstUsers);	
		return "Usuarios/Usuarios";
	}

}
