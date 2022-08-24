package com.educaciontit.jdbc.implementaciones;

import java.util.List;

import com.educaciontit.entidades.Usuario;
import com.educaciontit.jdbc.DAO;

public class UsuarioImplementacion implements DAO<Usuario, String> {

	public Usuario buscarPorClavePrimaria(String correo) {

		return null;
	}

	public boolean insertar(Usuario usuario) {

		return false;
	}

	public boolean actualizar(Usuario usuario) {

		return false;
	}

	public boolean eliminar(Usuario usuario) {

		return false;
	}

	public List<Usuario> listar() {

		return null;
	}

}
