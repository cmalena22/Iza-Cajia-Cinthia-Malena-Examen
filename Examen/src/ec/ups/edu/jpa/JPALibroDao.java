package ec.ups.edu.jpa;

import java.util.List;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ec.ups.edu.dao.LibroDao;
import ec.ups.edu.entidades.Libro;


public class JPALibroDao extends JPAGenericDao<Libro, Integer>  implements LibroDao {
	
	public JPALibroDao() {
		super(Libro.class);
	}
	/*public List<Telefono> finallby(String cedula){
		Usuario usuario=JPADaoFactory.getFactory().getUsuarioDao().read(cedula);
		CriteriaBuilder cri= em.getCriteriaBuilder();
		CriteriaQuery<Telefono>query=cri.createQuery(Telefono.class);
		Root<Telefono> telfroot=query.from(Telefono.class);
		Predicate predicado=cri.equal(telfroot.get("cedula"), usuario);
		query.select(telfroot).where(predicado);
		
		return em.createQuery(query).getResultList();
		
	}*/

	@Override
	public List<Libro> finallby(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

}
