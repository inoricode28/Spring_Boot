package idat.edu.pe.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.Model.UsuarioForm;
import idat.edu.pe.Model.Repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<UsuarioForm> listarUsuario(){
		return usuarioRepository.findAll();
	}		

}
