package idat.edu.pe.Model;

public class UsuarioForm {
	private String id;
	private String email;
	private String contrasenia;

	public UsuarioForm() {

	}

	public UsuarioForm(String id, String email, String contrasenia) {
		this.id = id;
		this.email = email;
		this.contrasenia = contrasenia;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

}
