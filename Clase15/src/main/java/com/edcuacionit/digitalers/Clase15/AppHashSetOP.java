package com.edcuacionit.digitalers.Clase15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AppHashSetOP {
	public static void main(String[] args) {

		Set<Usuario> usuarios = new LinkedHashSet<>();
		Usuario usuario1 = new Usuario("user1", 1234);
		Usuario usuario2 = new Usuario("user1", 1234);
		Usuario usuario3 = new Usuario("user3", 1234);
		Usuario usuario4 = new Usuario("user1", 1235);

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);

		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

	}
}
