package idat.edu.pe.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedores")
public class ProveedoresForm {
	
	@Id
	private String codID;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="razon")
	private String razon;
	
	@Column(name="fechfactu")
	private String fechfactu;

	public ProveedoresForm(String codID, String nombre, String direccion, String razon, String fechfactu) {
		super();
		this.codID = codID;
		this.nombre = nombre;
		this.direccion = direccion;
		this.razon = razon;
		this.fechfactu = fechfactu;
	}

	public ProveedoresForm() {
		
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

	public String getFechfactu() {
		return fechfactu;
	}

	public void setFechfactu(String fechfactu) {
		this.fechfactu = fechfactu;
	}	
	
	
}
