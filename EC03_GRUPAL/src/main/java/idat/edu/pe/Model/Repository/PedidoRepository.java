package idat.edu.pe.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.Model.PedidosForm;


@Repository
public interface PedidoRepository extends JpaRepository<PedidosForm, Integer>{

}
