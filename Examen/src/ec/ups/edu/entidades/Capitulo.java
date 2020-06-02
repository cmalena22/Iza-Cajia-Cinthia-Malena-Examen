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
	private int numero;
	private String titulo;		
	@ManyToOne
	@JoinColumn
	private Libro codigoli;
	@OneToOne
	@JoinColumn
	private Autor codigoautor;
	
	
	
	private static final long serialVersionUID = 1L;

	public Capitulo() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
