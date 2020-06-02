package ec.ups.edu.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity

public class Capitulo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String Nacionalidad;		
	@ManyToOne
	@JoinColumn
	private Libro codigoli;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "codigoautor")
	private Autor codigoautor;
	
	
	
	private static final long serialVersionUID = 1L;

	public Capitulo() {
		
	}
	

	public Capitulo(String nombre, String nacionalidad, Libro codigoli, Autor codigoautor) {
		super();
		this.nombre = nombre;
		Nacionalidad = nacionalidad;
		this.codigoli = codigoli;
		this.codigoautor = codigoautor;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public Libro getCodigoli() {
		return codigoli;
	}

	public void setCodigoli(Libro codigoli) {
		this.codigoli = codigoli;
	}

	public Autor getCodigoautor() {
		return codigoautor;
	}

	public void setCodigoautor(Autor codigoautor) {
		this.codigoautor = codigoautor;
	}

	@Override
	public String toString() {
		return "Capitulo [codigo=" + codigo + ", nombre=" + nombre + ", Nacionalidad=" + Nacionalidad + ", codigoli="
				+ codigoli + ", codigoautor=" + codigoautor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitulo other = (Capitulo) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
   
}
