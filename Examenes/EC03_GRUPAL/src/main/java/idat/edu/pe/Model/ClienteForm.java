package idat.edu.pe.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteForm {
	
	@Id
	private String codID;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "razon")
	private String razon;

	public ClienteForm(String codID, String nombre, String telefono, String direccion, String razon) {
		super();
		this.codID = codID;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.razon = razon;
	}

	public ClienteForm() {
		
	}

	public String getCodID() {
		return codID;
	}

	public void setCodID(String codID) {
		this.codID = codID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}	
	
	
}
