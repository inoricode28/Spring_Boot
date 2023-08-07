package idat.edu.pe.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.Model.ProveedoresForm;

@Repository
public interface ProveedoresRepository extends JpaRepository<ProveedoresForm, String> {

	
}