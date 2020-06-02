package ec.ups.edu.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.dao.DaoFactory;
import ec.ups.edu.dao.LibroDao;
import ec.ups.edu.entidades.Libro;
import ec.ups.edu.jpa.JPADaoFactory;


/**
 * Servlet implementation class ListTelefonoServlet
 */
@WebServlet("/ListTelefonoServlet")
public class ListTelefonoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroDao dao = DaoFactory.getFactory().getLibroDao();
	
	//JDBCTelefonoDAO tel= new JDBCTelefonoDAO();
	Libro libro=new Libro();
       
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTelefonoServlet() {
        super();
     //   dao=DaoFactory.getFactory().getTelefonoDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion=request.getParameter("accion");
		switch (accion) {		
		case "Registrar":
			System.out.println("shdbsdhfbshfbsfh");
			  response.sendRedirect("/Examen/JSPs/RegistraLibro.jsp");  
			 
			//request.getRequestDispatcher("../html/index.html").forward(request, response);
			  break;
		default:
			  break;
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre=request.getParameter("nombre");
	List<Libro>lista=JPADaoFactory.getFactory().getLibroDao().finallby(nombre);
	System.out.println(lista);
	request.setAttribute("telefono", lista);
	request.getRequestDispatcher("/JSPs/ListarLibro.jsp").forward(request, response);
	
	}

}
