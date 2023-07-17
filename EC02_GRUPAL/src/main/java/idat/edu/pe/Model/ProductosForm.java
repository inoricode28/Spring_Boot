package idat.edu.pe.Model;

public class ProductosForm {
	private String codproducto;
	private String nombre;
	private String stock;
	private String precio;
	private String proveedor;

	public ProductosForm(String codproducto, String nombre, String stock, String precio, String proveedor) {

		this.codproducto = codproducto;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.proveedor = proveedor;
	}

	public ProductosForm() {
	}

	public String getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(String codproducto) {
		this.codproducto = codproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

}
