package ec.ups.edu.jpa;

import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.LibroDao;
import ec.ups.edu.entidades.Capitulo;
import ec.ups.edu.entidades.Libro;


public class JPACapituloDao extends JPAGenericDao<Capitulo, Integer>  implements CapituloDao{
	public JPACapituloDao() {
		super(Capitulo.class);
	}
}
