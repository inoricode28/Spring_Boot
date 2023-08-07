package idat.edu.pe.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.Model.ProductosForm;

@Repository //@Repository se usa para marcar una clase como un componente encargado de interactuar con una base de datos
public interface ProductosRepository extends JpaRepository<ProductosForm, String>{ // el listex viene del model y el String viene del ID del model que es String

}
