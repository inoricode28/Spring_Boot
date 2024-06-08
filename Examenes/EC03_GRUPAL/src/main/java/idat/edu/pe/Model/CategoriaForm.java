package idat.edu.pe.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class CategoriaForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codCategoria;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "marca")
	private String marca;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "nomproveerdor")
	private String nomproveedor;

	public CategoriaForm(int codCategoria, String nombre, String marca, String descripcion, String nomproveedor) {
		this.codCategoria = codCategoria;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.nomproveedor = nomproveedor;
	}

	public CategoriaForm() {
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNomproveedor() {
		return nomproveedor;
	}

	public void setNomproveedor(String nomproveedor) {
		this.nomproveedor = nomproveedor;
	}

}
