package idat.edu.pe.Model;

public class ClienteForm {
	private String Id;
	private String Nombre;
	private String Telefono;
	private String Direccion;
	private String Razon;
	
	public ClienteForm(String id, String nombre, String telefono, String direccion, String razon) {
		
		this.Id = id;
		this.Nombre = nombre;
		this.Telefono = telefono;
		this.Direccion = direccion;
		this.Razon = razon;
	}

	public ClienteForm() {
		
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getRazon() {
		return Razon;
	}

	public void setRazon(String razon) {
		Razon = razon;
	}	
	
}
