package ec.ups.edu.dao;

import java.util.List;

import ec.ups.edu.entidades.Libro;

public interface LibroDao extends GenericDao<Libro, Integer>{
	abstract List<Libro>finallby(String cedula);
}
