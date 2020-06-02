package ec.ups.edu.servlet;

import java.io.IOException;



import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;



/**
 * Servlet implementation class BuscarPorCedulaServlet
 */
@WebServlet("/BuscarPorCedulaServlet")
public class BuscarPorCedulaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// TelefonoDao dao = DaoFactory.getFactory().getTelefonoDao();
	
	//JDBCTelefonoDAO tel= new JDBCTelefonoDAO();
	//Telefono telefono=new Telefono();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarPorCedulaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion=request.getParameter("accion");
		if (accion.equalsIgnoreCase("Iniciar")) {
			System.out.println("shdbsdhfbshfbsfh");
			  response.sendRedirect("/TELEFONOSJPA/html/index.html");  
		}
		else if (accion.equalsIgnoreCase("Insertar")) {
			System.out.println("usuarioooooooooooooooo");
			response.sendRedirect("/TELEFONOSJPA/JSPs/InsertarUsuario.jsp");  
		}
		else if (accion.equalsIgnoreCase("Inicio")) {
			System.out.println("casaaaaaaaaaaaaaaaaaaaaaaaaa");
			response.sendRedirect("/TELEFONOSJPA/JSPs/Publicca.jsp");  
		}
		/*switch (accion) {		
		case "Iniciar":
			System.out.println("shdbsdhfbshfbsfh");
			  response.sendRedirect("/PracticaJSPYJEE/html/index.html");  
			//request.getRequestDispatcher("../html/index.html").forward(request, response);
		case "Insertar":
			System.out.println("usuarioooooooooooooooo");
			response.sendRedirect("/PracticaJSPYJEE/JSPs/InsertarUsuario.jsp");  
			//request.getRequestDispatcher("../html/index.html").forward(request, response);
			  break;
		default:
			break;
		}*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	/*	String accion=request.getParameter("accion");
		String dato=request.getParameter("buscar");
		String correo=request.getParameter("correo");
		try {
			List<Telefono>lista=dao.findbyUserId(dato);
			request.setAttribute("telefono", lista);
			request.getRequestDispatcher("/JSPs/Publicca.jsp").forward(request, response);	
		} catch (Exception e) {
			request.getRequestDispatcher("/JSPs/Publicca.jsp").forward(request, response);			
			
		
		}*/
					
					
			
		
	}

}
