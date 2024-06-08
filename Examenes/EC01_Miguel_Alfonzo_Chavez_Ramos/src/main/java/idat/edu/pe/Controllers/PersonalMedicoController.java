package idat.edu.pe.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Models.PersonalMedicoModels;

@Controller
@RequestMapping("/Medico")
public class PersonalMedicoController {
	@GetMapping({ "index", "", "/" })
	public String index() {
		return "Medico/index";
	}

	@GetMapping({ "perfil", "/listado", "/perfil", "/listado/" })
	public String perfil(Model model) {
		PersonalMedicoModels miPersonalMedico = new PersonalMedicoModels();
		miPersonalMedico.setIdPerMedico("ADMI-0001");
		miPersonalMedico.setNombre("Miguel");
		miPersonalMedico.setApPaterno("Chavez");
		miPersonalMedico.setApMaterno("Ramos");
		miPersonalMedico.setTelefono("935681037");
		miPersonalMedico.setDireccion("Jr.Las anemonas");
		miPersonalMedico.setHorario("8:00 AM - 6:00 PM");
		miPersonalMedico.setEspecialidad("Traumatologia");
		miPersonalMedico.setSalario("S/. 2500");
		miPersonalMedico.setMedAsignado("MA-0001");
		model.addAttribute("miPersonalMedico", miPersonalMedico);
		return "Medico/perfil";
	}

	@GetMapping({ "/listar", "/consolidado", "/listar/", "/consolidado/" })
	public String Listar(Model model) {
		List<PersonalMedicoModels> lstPersonalMedico = new ArrayList<>();
		model.addAttribute("lstPersonalMedico", lstPersonalMedico);
		PersonalMedicoModels miPersonalMedico = new PersonalMedicoModels();

		miPersonalMedico.setIdPerMedico("ADMI-0001");
		miPersonalMedico.setNombre("Miguel");
		miPersonalMedico.setApPaterno("Chavez");
		miPersonalMedico.setApMaterno("Ramos");
		miPersonalMedico.setTelefono("935681037");
		miPersonalMedico.setDireccion("Jr.Las anemonas");
		miPersonalMedico.setHorario("8:00 AM - 6:00 PM");
		miPersonalMedico.setEspecialidad("Traumatologia");
		miPersonalMedico.setSalario("S/. 2500");
		miPersonalMedico.setMedAsignado("MA-0001");
		lstPersonalMedico.add(miPersonalMedico);
		return "Medico/listar";
	}
}
