package ec.ups.edu.entidades;

import ec.ups.edu.dao.AutorDao;
import ec.ups.edu.dao.CapituloDao;
import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.LibroDao;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AutorDao au= DaoFactory.getFactory().getAutorDao();
			CapituloDao cap=DaoFactory.getFactory().getCapituloDao();
			LibroDao li=DaoFactory.getFactory().getLibroDao();
			//AutorDao au= DaoFactory.getFactory().getAutorDao();
			/*Capitulo c= new Capitulo();
			c.setNumero(1);
			c.setTitulo("Hola");
			c.setCodigoautor(new Autor("Luis","Ecuatoriano",c));
			cap.create(c);*/
			Libro libro =  new Libro();
			libro.setISBN("2132");
			libro.setNombre("CCCCC");
			libro.setNumpaginas(11);
			//li.create(libro);
			Autor autor= new Autor();
			autor.setNacionalidad("Ecuatoriano");
			autor.setNombre("dfgdfg");
			//au.create(autor);
			Capitulo c= new Capitulo();
			c.setNumero(1);
			c.setTitulo("Hola");
			c.setCodigoli(new Libro("isis","ccc",545));
			c.setCodigoautor(new Autor("Italiano","jdkfjdkf"));
			cap.create(c);
			
			
			
	}

}
