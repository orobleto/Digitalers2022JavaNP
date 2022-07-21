package com.edcuacionit.digitalers.comparadores;

import java.util.Comparator;

import com.edcuacionit.digitalers.entidades.Usuario;

public class UsuarioOrdenCorreo implements Comparator<Usuario> {

	@Override
	public int compare(Usuario usuario1, Usuario usuario2) {
		return usuario1.getCorreo().compareTo(usuario2.getCorreo());
	}

}
