package ar.com.integrador.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ar.com.integrador.dao.iOradorDAO;
import ar.com.integrador.db.AdministradorDeConexiones;
import ar.com.integrador.domain.Orador;

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

				return new Orador(idBd, nombreBd, apellidoBd, mailBd, temaBd, activoBd, fotoUrlBd);
			} else {
				System.out.println("No se encontró un orador con ID: " + id);
				return null;
			}
		} catch (SQLException e) {
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
				oradores.add(crearOrador(resultSet));
			}
			return oradores;
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
	public void update(Orador orador) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "UPDATE oradores SET nombre = ?, apellido = ?, email = ?, tema = ?, activo = ?, foto_url = ? WHERE id_orador = ?";

		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getMail());
			statement.setString(4, orador.getTema());
			statement.setString(5, orador.getActivo());
			statement.setString(6, orador.getFotoUrl());
			statement.setLong(7, orador.getId());

			int rowsAffected = statement.executeUpdate();
			System.out.println("Filas afectadas por la actualización: " + rowsAffected);
		} finally {
			cerrar(connection);
		}
	}

	@Override
	public void create(Orador newOrador) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "INSERT INTO oradores (nombre, apellido, email, tema, activo, foto_url) VALUES (?, ?, ?, ?, ?, ?)";
		try (PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
			statement.setString(1, newOrador.getNombre());
			statement.setString(2, newOrador.getApellido());
			statement.setString(3, newOrador.getMail());
			statement.setString(4, newOrador.getTema());
			statement.setString(5, "S");
			statement.setString(6, newOrador.getFotoUrl());
			statement.execute();

			ResultSet res = statement.getGeneratedKeys();
			if (res.next()) {
				System.out.println("Se creó el Orador correctamente");
			}
		} finally {
			cerrar(connection);
		}
	}

	@Override
	public List<Orador> search(String clave) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "SELECT * FROM ORADORES WHERE TEMA LIKE ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "%" + clave + "%");

		ResultSet resultSet = statement.executeQuery();

		List<Orador> oradores = new ArrayList<>();
		while (resultSet.next()) {
			oradores.add(crearOrador(resultSet));
		}

		cerrar(connection);

		return oradores;
	}

	private void cerrar(Connection con) throws Exception {
		con.close();
	}

	private Orador crearOrador(ResultSet resultSet) throws Exception {
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
