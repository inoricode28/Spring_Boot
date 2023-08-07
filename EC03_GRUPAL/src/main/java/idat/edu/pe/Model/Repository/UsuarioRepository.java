package idat.edu.pe.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.Model.UsuarioForm;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioForm, String> {

}