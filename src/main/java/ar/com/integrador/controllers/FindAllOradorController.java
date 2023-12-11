package ar.com.integrador.controllers;

import ar.com.integrador.dao.iOradorDAO;
import ar.com.integrador.dao.implement.OradorDAOMysqlImpl;
import ar.com.integrador.domain.Orador;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FindAllOradorController")
public class FindAllOradorController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		iOradorDAO dao = new OradorDAOMysqlImpl();
		List<Orador> oradores = new ArrayList<>();

		try {
			oradores = dao.findAll();
			req.setAttribute("listado", oradores);
			// Redirigir a listado.jsp
			getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
		} catch (Exception e) {
			// Manejo general de excepciones
			req.setAttribute("error", "Ocurrió un error al procesar la solicitud.");
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
			e.printStackTrace(); // Loguear la excepción
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
