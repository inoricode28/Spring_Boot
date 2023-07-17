package idat.edu.pe.Model;

public class ProveedoresForm {
	
	private String codRUC;
	private String nombre;
	private String Direccion;
	private String Razon;
	private String FechFactu;
	
	
	public ProveedoresForm(String codRUC, String nombre, String direccion, String razon, String fechFactu) {
		
		this.codRUC = codRUC;
		this.nombre = nombre;
		this.Direccion = direccion;
		this.Razon = razon;
		this.FechFactu = fechFactu;
	}
	public ProveedoresForm() {
		
	}
	public String getCodRUC() {
		return codRUC;
	}
	public void setCodRUC(String codRUC) {
		this.codRUC = codRUC;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getFechFactu() {
		return FechFactu;
	}
	public void setFechFactu(String fechFactu) {
		FechFactu = fechFactu;
	}
	
	
	
	
	

	
	
	
	
}
