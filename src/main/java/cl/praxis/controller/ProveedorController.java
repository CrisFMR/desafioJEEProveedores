package cl.praxis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.dao.ProveedorDAO;
import cl.praxis.model.dao.ProveedorDAOImpl;
import cl.praxis.model.dto.Proveedores;

@WebServlet("/proveedores")
public class ProveedorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ProveedorController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProveedorDAO pDAO = new ProveedorDAOImpl();
		
		List<Proveedores> proveedores = pDAO.read();
		
		request.setAttribute("proveedores", proveedores);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
