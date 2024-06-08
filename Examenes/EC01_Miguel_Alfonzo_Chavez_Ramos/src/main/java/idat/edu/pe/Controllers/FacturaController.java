package idat.edu.pe.Controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.Models.FacturaModels;

@Controller
@RequestMapping("/Factura")
public class FacturaController {
    @GetMapping({ "index", "", "/" })
    public String index() {
    return "Factura/index";
    }
    @GetMapping({ "perfil", "/listado", "/perfil", "/listado/" })
    public String perfil(Model model) {
    FacturaModels miFactura = new FacturaModels();
    miFactura.setIdFactura("FAC-001");
    miFactura.setCargo("Traumatologia");
    miFactura.setCliente("Miguel");
    miFactura.setFacturista("77777");
    miFactura.setTipoPago("Efectivo");
    miFactura.setTipoMoneda("Soles");
    miFactura.setEmpresa("Macmillan");
    miFactura.setFechaExp("12/08/2023");
    miFactura.setHrExpe("12:00 AM");
    miFactura.setEstadoFac("Anulado");   
    model.addAttribute("miFactura", miFactura);
    return "Factura/perfil";
    }

    @GetMapping({ "/listar", "/consolidado", "/listar/", "/consolidado/" })
    public String Listar(Model model) {
    List<FacturaModels> lstFacturaModels = new ArrayList<>();
    model.addAttribute("lstFacturaModels", lstFacturaModels);
    FacturaModels miFactura = new FacturaModels();
    
    miFactura.setIdFactura("FAC-001");
    miFactura.setCargo("Traumatologia");
    miFactura.setCliente("Miguel");
    miFactura.setFacturista("77777");
    miFactura.setTipoPago("Efectivo");
    miFactura.setTipoMoneda("Soles");
    miFactura.setEmpresa("Macmillan");
    miFactura.setFechaExp("12/08/2023");
    miFactura.setHrExpe("12:00 AM");
    miFactura.setEstadoFac("Anulado");
    
    lstFacturaModels.add(miFactura);
    
    return "Factura/listar";
    }
}
