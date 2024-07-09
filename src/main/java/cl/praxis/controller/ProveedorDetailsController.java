package cl.praxis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.dao.ProveedorDAOImpl;
import cl.praxis.model.dao.ProveedorDAO;
import cl.praxis.model.dto.Proveedores;


@WebServlet("/ProveedorDetails")
public class ProveedorDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProveedorDetailsController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String op = request.getParameter("op");
		String strId = request.getParameter("id");
		
		int id = 0;
		
		if (strId != null) {
			id = Integer.parseInt(strId);
		}
		
		if (id > 0 && op==null) {
			
			ProveedorDAOImpl pDAO = new ProveedorDAOImpl();
			Proveedores p = pDAO.read(id);
			
			request.setAttribute("proveedores", p);
			
			getServletContext().getRequestDispatcher("/details.jsp").forward(request, response);
		} else if (id == 0){
			getServletContext().getRequestDispatcher("/details.jsp").forward(request, response);
		} else if(op.equalsIgnoreCase("del")) {
			ProveedorDAOImpl pDAO = new ProveedorDAOImpl();
			pDAO.delete(id);
			
			response.sendRedirect(request.getContextPath()+ "/proveedores");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strId = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String contacto = request.getParameter("contacto");
		String telefonoContacto = request.getParameter("telefonoContacto");
		
		Proveedores p = null;
		ProveedorDAO pDAO = new ProveedorDAOImpl();
		
		if (!strId.isEmpty()) {
			int id = Integer.parseInt(strId);
			
			p = new Proveedores(id, nombre, rut, direccion, correo, telefono, contacto, telefonoContacto);
			pDAO.update(p);	
		} else{
			p = new Proveedores();
			p.setNombre(nombre);
			p.setRut(rut);
			p.setDireccion(direccion);
			p.setCorreo(correo);
			p.setTelefono(telefono);
			p.setContacto(contacto);
			p.setTelefonoContacto(telefonoContacto);
			
			pDAO.create(p);
		}
		
		response.sendRedirect(request.getContextPath() + "/proveedores");
		
	}

}
