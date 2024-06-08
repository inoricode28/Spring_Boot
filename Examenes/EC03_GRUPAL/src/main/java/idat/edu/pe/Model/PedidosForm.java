package idat.edu.pe.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos")
public class PedidosForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int Id;
	@Column(name="telefonocliente")
	private String telefonocliente;
	@Column(name="nombrecliente")
	private String nombrecliente;
	@Column(name="dni")
	private String dni;
	@Column(name="direccion")
	private String direccion;
	@Column(name="fechaentrega")
	private String fechaentrega;
	
	public PedidosForm (){
		
	}

	public PedidosForm(int id, String telefonocliente, String nombrecliente, String dni, String direccion,
			String fechaentrega) {
		super();
		Id = id;
		this.telefonocliente = telefonocliente;
		this.nombrecliente = nombrecliente;
		this.dni = dni;
		this.direccion = direccion;
		this.fechaentrega = fechaentrega;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTelefonocliente() {
		return telefonocliente;
	}

	public void setTelefonocliente(String telefonocliente) {
		this.telefonocliente = telefonocliente;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaentrega() {
		return fechaentrega;
	}

	public void setFechaentrega(String fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	
}


