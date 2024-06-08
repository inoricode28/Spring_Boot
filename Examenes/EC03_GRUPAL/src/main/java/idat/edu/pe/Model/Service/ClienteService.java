package idat.edu.pe.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Model.ClienteForm;
import idat.edu.pe.Model.Repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<ClienteForm> listarCliente(){
		return clienteRepository.findAll();
	}	

}
