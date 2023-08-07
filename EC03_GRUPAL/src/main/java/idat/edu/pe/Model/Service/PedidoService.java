package idat.edu.pe.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Model.PedidosForm;
import idat.edu.pe.Model.Repository.PedidoRepository;


@Service

public class PedidoService {
	
	@Autowired
	PedidoRepository pedRepository;
	
	
	public List<PedidosForm> listarPedidos(){
		return pedRepository.findAll();	}

}
