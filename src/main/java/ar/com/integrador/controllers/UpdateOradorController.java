package ar.com.integrador.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.integrador.dao.iOradorDAO;
import ar.com.integrador.dao.implement.OradorDAOMysqlImpl;
import ar.com.integrador.domain.Orador;

@WebServlet("/UpdateOradorController")
public class UpdateOradorController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Capturo los parámetros que vienen en el request enviado por el formulario
		String id = req.getParameter("id");

		// Validando el ID
		if (id == null || id.isEmpty()) {
			// Manejar el caso en que el ID es nulo o vacío
			System.out.println("ID es nulo o vacío en DoPost  updateoradorcontroller");
			// Puedes agregar una redirección o devolver un mensaje de error aquí
			return;
		}

		// Convertir el ID a Long
		Long oradorId = Long.parseLong(id);

		String nombre = req.getParameter("nombre");// name de input
		String apellido = req.getParameter("apellido");// name de input
		String mail = req.getParameter("mail");
		String tema = req.getParameter("tema");
		String activo = "S";// name de input;
		String fotoUrl = req.getParameter("foto_url");

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
			getServletContext().getRequestDispatcher("/dashboard.jsp").forward(req, resp);
			return;
		}

		// Instanciar el DAO y el Orador
		iOradorDAO dao = new OradorDAOMysqlImpl();
		Orador orador;

		try {
			Orador oradorExistente = dao.getById(oradorId);

			if (oradorExistente != null) {
				// Actualizar solo los campos necesarios
				oradorExistente.setNombre(nombre);
				oradorExistente.setApellido(apellido);
				oradorExistente.setMail(mail);
				oradorExistente.setTema(tema);
				oradorExistente.setFotoUrl(fotoUrl);

				// No sobrescribir el campo activo si no está presente en el formulario
				if (req.getParameter("activo") != null) {
					oradorExistente.setActivo("S");
				}

				// Actualizar el Orador en la base de datos
				try {
					dao.update(oradorExistente);
					// Mensaje de éxito
					req.setAttribute("success", List.of("Orador id:" + oradorExistente.getId() + " actualizado correctamente"));
				} catch (Exception e) {
					e.printStackTrace();
					req.setAttribute("errors", List.of("Error actualizando Orador<" + e.getMessage()));
				}
			} else {
				// Manejar el caso en que no se encuentra el Orador por el ID
				req.setAttribute("errors", List.of("No se encontró un orador con ID: " + oradorId));
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errors", List.of("Error obteniendo el orador<" + e.getMessage()));
		}

		// Redirigir a la página principal (DashboardOradorController)
		getServletContext().getRequestDispatcher("/DashboardOradorController").forward(req, resp);
	}
	// Cuando desde el listado, por URL, viene al método GET
	// Cargar el orador y enviarlo a la JSP que va a editar los datos
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		//System.out.println("ID obtenido: " + id);
		//System.out.println("ID obtenido en doGet: " + id);

		// Realizar validaciones para los datos que vienen

		// Instanciar el DAO y obtener el Orador por ID
		iOradorDAO dao = new OradorDAOMysqlImpl();
		Orador orador = null;

		try {
			orador = dao.getById(Long.parseLong(id));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Guardar el orador en el request y pasar dicho orador a la JSP
		req.setAttribute("orador", orador);

		// Redirigir a la página de edición (editar.jsp)
		getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);
	}
}