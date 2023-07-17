package idat.edu.pe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IntegrantesController {
	@GetMapping("/home")
	public ModelAndView login() {
		ModelAndView modelView = new ModelAndView();		
		return modelView;
	}

}
