package idat.edu.pe.Model;

public class VentasForm {
	private int  ID;
	private int Codigo;
	private String Producto;
	private Double PrecioU;
	private int Cant;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getProducto() {
		return Producto;
	}
	public void setProducto(String producto) {
		Producto = producto;
	}
	public Double getPrecioU() {
		return PrecioU;
	}
	public void setPrecioU(Double precioU) {
		PrecioU = precioU;
	}
	public int getCant() {
		return Cant;
	}
	public void setCant(int cant) {
		Cant = cant;
	}
	public VentasForm(int iD, int codigo, String producto, Double precioU, int cant) {
		
		ID = iD;
		Codigo = codigo;
		Producto = producto;
		PrecioU = precioU;
		Cant = cant;
	}
	public VentasForm() {
		
	}
	

	

}
