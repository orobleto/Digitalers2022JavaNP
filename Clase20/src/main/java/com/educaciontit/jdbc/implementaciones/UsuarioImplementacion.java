package com.educaciontit.jdbc.implementaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.educaciontit.entidades.Usuario;
import com.educaciontit.jdbc.DAO;
import com.octaviorobleto.commons.utilities.text.StringUtils;
import com.octaviorobleto.commons.utilities.time.DateUtils;

public class UsuarioImplementacion implements DAO<Usuario, String> {
	private final static String KEY = "digitalers2022";
	private PreparedStatement preparedStatementBuscarPorClavePrimaria;
	private PreparedStatement preparedStatementInsertar;
	private PreparedStatement preparedStatementEliminar;
	private PreparedStatement preparedStatementActualizar;
	private PreparedStatement preparedStatementListar;
	private Connection conexion;

	public UsuarioImplementacion(Connection conexion) {
		super();
		this.conexion = conexion;
	}

	// findByID
	public Usuario buscarPorClavePrimaria(String correo) {
		if (StringUtils.isEmpty(correo)) {
			return null;
		}
		String query = "select AES_DECRYPT(clave, ?) as clave, activo, fechacreacion from usuarios where correo = ?";

		try {
			if (preparedStatementBuscarPorClavePrimaria == null) {
				preparedStatementBuscarPorClavePrimaria = conexion.prepareStatement(query);
			}
			preparedStatementBuscarPorClavePrimaria.setString(1, KEY);
			preparedStatementBuscarPorClavePrimaria.setString(2, correo);

			ResultSet resultado = preparedStatementBuscarPorClavePrimaria.executeQuery();
			if (resultado.next()) {
				String clave = resultado.getString("clave");
				boolean activo = resultado.getBoolean("activo");
				LocalDateTime fechaCreacion = DateUtils.getLocalDateTime(resultado.getString("fechaCreacion"),
						"yyyy-MM-dd HH:mm:ss");
				Usuario usuario = new Usuario(correo, clave, activo, fechaCreacion);
				return usuario;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertar(Usuario usuario) {
		if (usuario == null) {
			return false;
		}

		String query = "insert into usuarios (correo,clave,activo,fechaCreacion) values (?,AES_ENCRYPT(?,?),?,NOW());";
		try {
			if (preparedStatementInsertar == null) {
				preparedStatementInsertar = conexion.prepareStatement(query);
			}

			preparedStatementInsertar.setString(1, usuario.getCorreo());
			preparedStatementInsertar.setString(2, usuario.getClave());
			preparedStatementInsertar.setString(3, KEY);
			preparedStatementInsertar.setBoolean(4, usuario.getActivo());

			return preparedStatementInsertar.executeUpdate() == 1;
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}

	public boolean actualizar(Usuario usuario) {
		if (usuario == null) {
			return false;
		}
		String query = "update usuarios set clave = AES_ENCRYPT(?, ?), activo = ? where correo = ?";
		try {
			if (preparedStatementActualizar == null) {
				preparedStatementActualizar = conexion.prepareStatement(query);
			}

			preparedStatementActualizar.setString(1, usuario.getClave());
			preparedStatementActualizar.setString(2, KEY);
			preparedStatementActualizar.setBoolean(3, usuario.getActivo());
			preparedStatementActualizar.setString(4, usuario.getCorreo());

			return preparedStatementActualizar.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean eliminar(Usuario usuario) {
		if (usuario == null) {
			return false;
		}
		String query = "delete from usuarios where correo = ?";
		try {
			if (preparedStatementEliminar == null) {
				preparedStatementEliminar = conexion.prepareStatement(query);
			}
			preparedStatementEliminar.setString(1, usuario.getCorreo());

			return preparedStatementEliminar.executeUpdate() == 1;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<>();
		String query = "select correo, AES_DECRYPT(clave, ?) as clave, activo, fechacreacion from usuarios";
		try {
			if (preparedStatementListar == null) {
				preparedStatementListar = conexion.prepareStatement(query);
			}
			preparedStatementListar.setString(1, KEY);

			ResultSet resultado = preparedStatementListar.executeQuery();

			while (resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setCorreo(resultado.getString("correo"));
				usuario.setClave(resultado.getString("clave"));
				usuario.setActivo(resultado.getBoolean("activo"));
				usuario.setFechaCreacion(
						DateUtils.getLocalDateTime(resultado.getString("fechaCreacion"), "yyyy-MM-dd HH:mm:ss"));

				usuarios.add(usuario);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

}
