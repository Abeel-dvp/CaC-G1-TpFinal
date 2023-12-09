package ar.com.integrador.dao.implement;
import java.sql.SQLException;
import ar.com.integrador.dao.iOradorDAO;
import ar.com.integrador.db.AdministradorDeConexiones;
import ar.com.integrador.domain.Orador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OradorDAOMysqlImpl implements iOradorDAO {

	@Override
	public Orador getById(Long id) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		System.out.println("Conexión establecida correctamente.");
		String sql = "SELECT * FROM oradores WHERE id_orador = ?";

		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setLong(1, id);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				Long idBd = resultSet.getLong("id_orador");
				String nombreBd = resultSet.getString("nombre");
				String apellidoBd = resultSet.getString("apellido");
				String mailBd = resultSet.getString("email");
				String temaBd = resultSet.getString("tema");
				String activoBd = resultSet.getString("activo");
				String fotoUrlBd = resultSet.getString("foto_url");

				// Resto del código
				return new Orador(idBd, nombreBd, apellidoBd, mailBd, temaBd, activoBd, fotoUrlBd);
			} else {
				System.out.println("No se encontró un orador con ID: " + id);
				return null;
			}
		} catch (SQLException e) {
			// Manejar la excepción específica
			e.printStackTrace();
			throw new Exception("Error al obtener el orador por ID", e);
		} finally {
			cerrar(connection);
		}
	}

	@Override
	public List<Orador> findAll() throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "SELECT * FROM oradores";
		try (Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery(sql)) {

			List<Orador> oradores = new ArrayList<>();
			while (resultSet.next()) {
				Long idBd = resultSet.getLong("id_orador");
				String nombreBd = resultSet.getString("nombre");
				String apellidoBd = resultSet.getString("apellido");
				String mailBd = resultSet.getString("email");
				String temaBd = resultSet.getString("tema");
				String activoBd = resultSet.getString("activo");
				String fotoUrlBd = resultSet.getString("foto_url");

				Orador orador = new Orador(idBd, nombreBd, apellidoBd, mailBd, temaBd, activoBd, fotoUrlBd);
				oradores.add(orador);
			}
			return oradores;
		} finally {
			cerrar(connection);
		}
	}

	@Override
	public void update(Orador orador) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "UPDATE oradores SET nombre = ?, apellido = ?, email = ?, tema = ?, activo = ?, foto_url = ? WHERE id_orador = ?";

		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			// Paso 1: Establecer valores en la sentencia SQL
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getMail());
			statement.setString(4, orador.getTema());
			statement.setString(5, orador.getActivo());

			// Depuración para verificar los valores antes de ejecutar la actualización
			System.out.println("Valores antes de la actualización:");
			System.out.println("Nombre: " + orador.getNombre());
			System.out.println("Apellido: " + orador.getApellido());
			System.out.println("Mail: " + orador.getMail());
			System.out.println("Tema: " + orador.getTema());
			System.out.println("Activo: " + orador.getActivo());

			// Paso 2: Agregar depuración para el valor de id en cada paso
			System.out.println("orador: " + orador);
			System.out.println("ID antes de verificar nulidad: " + orador.getId());

			Long id = orador.getId();
			if (id != null) {
				System.out.println("ID dentro de la condición antes de setear en el statement: " + id);

				// Paso 3: Usar setString para foto_url y setLong para id
				statement.setString(6, orador.getFotoUrl());
				statement.setLong(7, id.longValue());

				// Paso 4: Ejecutar la actualización
				int rowsAffected = statement.executeUpdate();
				System.out.println("Filas afectadas por la actualización: " + rowsAffected);
			} else {
				// Paso 5: Manejar el caso en que el ID es nulo
				System.out.println("No se puede actualizar el Orador porque el ID es nulo ( ORADORDAOMYSQLLMPL.");
			}
		} finally {
			// Paso 6: Cerrar la conexión
			cerrar(connection);
		}
	}


	// Resto de los métodos...

	@Override
	public void deleteOrador(Orador orador) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "DELETE FROM oradores WHERE id_orador = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setLong(1, orador.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al eliminar el orador", e);
		} finally {
			cerrar(connection);
		}
	}

	@Override
	public void delete(Long id) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "DELETE FROM oradores WHERE id_orador = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setLong(1, id);
			statement.executeUpdate();
		} finally {
			cerrar(connection);
		}
	}


	@Override
	public void create(Orador newOrador) throws Exception {
		// -1 necesito la conexión a la base
		Connection connection = AdministradorDeConexiones.getConnection();
		// 2 - arma el statement
		String sql = "insert into oradores (nombre, apellido, email, tema, activo, foto_url) values (?, ?, ?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		statement.setString(1, newOrador.getNombre());
		statement.setString(2, newOrador.getApellido());
		statement.setString(3, newOrador.getMail());
		statement.setString(4, newOrador.getTema());
		statement.setString(5, "S");
		statement.setString(6, newOrador.getFotoUrl());
		// 3 - devuelve un entero (devuelve 1 o 0), pero no hace falta confirmar para este caso
		statement.execute();

		ResultSet res = statement.getGeneratedKeys(); // RETORNA LA KEY QUE SE GENERÓ
		if (res.next()) {
			System.out.println("Se creó el Orador correctamente");
		}
		cerrar(connection);
	}

	@Override
	public List<Orador> search(String clave) throws Exception {
		// 1 - necesito la Connection
		Connection connection = AdministradorDeConexiones.getConnection();

		// 2 - arma el statement
		String sql = "SELECT * FROM oradores WHERE TEMA LIKE ?";
		PreparedStatement statement = connection.prepareStatement(sql);

		// setear el valor que va en reemplazo del ?
		statement.setString(1, "%" + clave + "%");

		// 3 - resultSet
		ResultSet resultSet = statement.executeQuery();

		// Interface i = new ClaseQueImplementaLaInterface();
		List<Orador> orador = new ArrayList<>();

		// verifico si hay datos
		while (resultSet.next()) {
			orador.add(this.crearOrador(resultSet));
		}

		cerrar(connection);

		return orador;
	}

	private void cerrar(Connection con) throws Exception {
		con.close();
	}

	private Orador crearOrador(ResultSet resultSet) throws Exception {
		// obtengo el dato del campo id
		Long idBd = resultSet.getLong("id_orador");
		String nombreBd = resultSet.getString("nombre");
		String apellidoBd = resultSet.getString("apellido");
		String mailBd = resultSet.getString("email");
		String temaBd = resultSet.getString("tema");
		String activoBd = resultSet.getString("activo");
		String fotoUrl = resultSet.getString("foto_url");

		return new Orador(idBd, nombreBd, apellidoBd, mailBd, temaBd, activoBd, fotoUrl);
	}
}