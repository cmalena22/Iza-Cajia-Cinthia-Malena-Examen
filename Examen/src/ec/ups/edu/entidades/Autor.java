package ec.ups.edu.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Autor
 *
 */
@Entity

public class Autor implements Serializable {
	@Id
	private int codigo;
	private String nombre;
	private String nacionalidad;
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn
	private Autor codigoautor;

	public Autor() {
		super();
	}
   
}
