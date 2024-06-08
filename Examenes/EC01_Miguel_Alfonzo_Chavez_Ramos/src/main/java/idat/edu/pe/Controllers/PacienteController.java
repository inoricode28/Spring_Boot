package idat.edu.pe.Controllers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import idat.edu.pe.Models.PacienteModels;

@Controller
@RequestMapping("/Paciente")
public class PacienteController {
	@GetMapping({ "index", "", "/" })
	public String index() {
		return "Paciente/index";
	}

	@GetMapping({ "perfil", "/listado", "/perfil", "/listado/" })
	public String perfil(Model model) {
		PacienteModels miPaciente = new PacienteModels();
		miPaciente.setIdPaciente("ADMI-001");
		miPaciente.setNombre("Miguel");
		miPaciente.setApPaterno("Chavez");
		miPaciente.setApMaterno("Ramos");
		miPaciente.setTipSangre("O+");
		miPaciente.setFechaSalida("20/03/2023");
		miPaciente.setFechaEntrada("20/03/2022");
		miPaciente.setGenero("M");
		miPaciente.setIdRegistro("RE-003");
		miPaciente.setIdHabitacion("HA-0001");
		miPaciente.setAtiPaciente("PAC-785");
		model.addAttribute("miPaciente", miPaciente);
		return "Paciente/perfil";
	}

	@GetMapping({ "/listar", "/consolidado", "/listar/", "/consolidado/" })
	public String Listar(Model model) {
		List<PacienteModels> lstPaciente = new ArrayList<>();
		model.addAttribute("lstPaciente", lstPaciente);
		PacienteModels miPaciente = new PacienteModels();
		PacienteModels miPaciente1 = new PacienteModels();
		
		miPaciente.setIdPaciente("ADMI-001");
		miPaciente.setNombre("Miguel");
		miPaciente.setApPaterno("Chavez");
		miPaciente.setApMaterno("Ramos");
		miPaciente.setTipSangre("O+");
		miPaciente.setFechaSalida("20/03/2023");
		miPaciente.setFechaEntrada("20/03/2022");
		miPaciente.setGenero("M");
		miPaciente.setIdRegistro("RE-003");
		miPaciente.setIdHabitacion("HA-0001");
		miPaciente.setAtiPaciente("PAC-785");
		
		miPaciente1.setIdPaciente("ADMI-002");
		miPaciente1.setNombre("Joseph");
		miPaciente1.setApPaterno("Mosquera");
		miPaciente1.setApMaterno("Portella");
		miPaciente1.setTipSangre("O+");
		miPaciente1.setFechaSalida("20/07/2023");
		miPaciente1.setFechaEntrada("20/07/2021");
		miPaciente1.setGenero("M");
		miPaciente1.setIdRegistro("RE-004");
		miPaciente1.setIdHabitacion("HA-0002");
		miPaciente1.setAtiPaciente("PAC-789");
		
		lstPaciente.add(miPaciente);
		lstPaciente.add(miPaciente1);		
		return "Paciente/listar";
	}

}
