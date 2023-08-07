package idat.edu.pe.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")
public class VentasForm {
	@Id
	private String ID_Cliente;
	
	@Column(name="Codigo")
	private String Codigo;
	
	@Column(name="Producto")
	private String Producto;
	
	@Column(name="PrecioUnitario")
	private Double PrecioUnitario;
	
	
	
	
	public String getID_Cliente() 
	{
		return ID_Cliente;
	}
	public void setID_Cliente(String iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getProducto() {
		return Producto;
	}
	public void setProducto(String producto) {
		Producto = producto;
	}
	public Double getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}
	
	
	
	
	
	public VentasForm(String iD_Cliente, String codigo, String producto, Double precioUnitario) {
		
		ID_Cliente = iD_Cliente;
		Codigo = codigo;
		Producto = producto;
		PrecioUnitario = precioUnitario;
	}
	public VentasForm() {
	
	}
	
	

}


