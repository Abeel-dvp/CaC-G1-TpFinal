package ar.com.integrador.controllers;

import ar.com.integrador.dao.iOradorDAO;
import ar.com.integrador.dao.implement.OradorDAOMysqlImpl;
import ar.com.integrador.domain.Orador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateOradorController")
public class CreateOradorController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Capturo los parámetros que vienen en el request enviado por el formulario
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String mail = req.getParameter("mail");
		String tema = req.getParameter("tema");
		String activo = "S";
		String foto_url = req.getParameter("foto_url");

		// Validaciones
		List<String> errores = new ArrayList<>();
		if (nombre == null || "".equals(nombre)) {
			errores.add("Nombre vacío");
		}
		if (apellido == null || "".equals(apellido)) {
			errores.add("Apellido vacío");
		}
		if (mail == null || "".equals(mail)) {
			errores.add("Mail vacío");
		}
		if (tema == null || "".equals(tema)) {
			errores.add("Tema vacío");
		}

		if (!errores.isEmpty()) {
			req.setAttribute("errors", errores);
			// Vuelvo a la JSP con la lista de errores cargada
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
			return;
		}

		// Instancio la implementación de la interfaz DAO
		iOradorDAO dao = new OradorDAOMysqlImpl();

		// Creo el objeto Orador con la nueva propiedad
		Orador orador = new Orador(null, nombre, apellido, mail, tema, activo, foto_url);

		try {
			// Llamo al método create del DAO
			dao.create(orador);
			req.setAttribute("success", List.of("Alta de Orador exitosa"));
		} catch (Exception e) {
			// Si falla, imprimo la excepción
			e.printStackTrace();
		}

		// Redirecciono a la página de visualización de todos los oradores
		getServletContext().getRequestDispatcher("/FindAllOradorController").forward(req, resp);
	}
}
