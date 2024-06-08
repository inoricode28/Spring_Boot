package idat.edu.pe.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Models.PersonAdmModels;

@Controller
@RequestMapping("/PersonAdm")
public class PersonAdmController {
	@GetMapping({ "/index", "", "/" })
	public String index() {
		return "PersonAdm/index";
	}

	@GetMapping({ "perfil", "/listado", "/perfil", "/listado/" })
	public String perfil(Model model) {
		PersonAdmModels miPersonAdm = new PersonAdmModels();
		miPersonAdm.setIdAdmin("ADMI-001");
		miPersonAdm.setNombre("Miguel Alfonzo");
		miPersonAdm.setTelefono("935681039");
		miPersonAdm.setDireccion("Jr.Las Anemonas");
		miPersonAdm.setApPaterno("Chavez");
		miPersonAdm.setApMaterno("Ramos");
		miPersonAdm.setPuesto("Administrador");
		miPersonAdm.setHorario("8:00 AM - 6:00 PM");
		miPersonAdm.setSalario("S/. 2200");
		miPersonAdm.setIdRegistro("REG-0001");
		miPersonAdm.setIdExaMed("EXMED-0001");
		miPersonAdm.setIdPaciente("PAC-786");
		model.addAttribute("miPersonAdm", miPersonAdm);
		return "PersonAdm/perfil";
	}

	@GetMapping({ "/listar", "/consolidado", "/listar/", "/consolidado/" })
	public String Listar(Model model) {
		List<PersonAdmModels> lstPersonAdm = new ArrayList<>();
		model.addAttribute("lstPersonAdm", lstPersonAdm);
		PersonAdmModels miPersonAdm1 = new PersonAdmModels();
		PersonAdmModels miPersonAdm2 = new PersonAdmModels();
		miPersonAdm1.setIdAdmin("ADMI-001");
		miPersonAdm1.setNombre("Miguel Alfonzo");
		miPersonAdm1.setTelefono("935681039");
		miPersonAdm1.setDireccion("Jr.Las Anemonas");
		miPersonAdm1.setApPaterno("Chavez");
		miPersonAdm1.setApMaterno("Ramos");
		miPersonAdm1.setPuesto("Administrador");
		miPersonAdm1.setHorario("8:00 AM - 6:00 PM");
		miPersonAdm1.setSalario("S/. 2200");
		miPersonAdm1.setIdRegistro("REG-0001");
		miPersonAdm1.setIdExaMed("EXMED-0001");
		miPersonAdm1.setIdPaciente("PAC-786");

		miPersonAdm2.setIdAdmin("ADMI-002");
		miPersonAdm2.setNombre("Joseph");
		miPersonAdm2.setTelefono("948123456");
		miPersonAdm2.setDireccion("Jr.Las Calendulas");
		miPersonAdm2.setApPaterno("Mosquera");
		miPersonAdm2.setApMaterno("Portella");
		miPersonAdm2.setPuesto("Supervisor");
		miPersonAdm2.setHorario("8:00 AM - 6:00 PM");
		miPersonAdm2.setSalario("S/. 2500");
		miPersonAdm2.setIdRegistro("REG-0002");
		miPersonAdm2.setIdExaMed("EXMED-0002");
		miPersonAdm2.setIdPaciente("PAC-787");

		lstPersonAdm.add(miPersonAdm1);
		lstPersonAdm.add(miPersonAdm2);
		return "PersonAdm/listar";

	}	

}
