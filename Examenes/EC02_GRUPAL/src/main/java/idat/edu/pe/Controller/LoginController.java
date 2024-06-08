package idat.edu.pe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ch.qos.logback.core.model.Model;
import idat.edu.pe.Model.LoginForm;


@Controller
public class LoginController {
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("loginform", new LoginForm());
		return modelView;
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("loginform") LoginForm loginForm, Model model) {
		if (loginForm.getUsuario().equals("mscomputers") && loginForm.getPassword().equals("123456")) {

			return "home";
		}

		return "login";

	}

}
