package ec.edu.ups.EVA_ReinosoJoseph_SRV.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Obra")
public class ObrasArte implements Serializable{
	
		
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "obr_id")
	private String id;
	@Column(name = "obr_nombre")
	private String nombre;
	@Column(name = "obr_autor")
	private String autor;
	@Column(name = "obr_descripcion")
	private String descripcion;
	@Column(name = "obr_anio")
	private String anio;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "ObrasArte [id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", descripcion=" + descripcion
				+ ", anio=" + anio + "]";
	}

}
