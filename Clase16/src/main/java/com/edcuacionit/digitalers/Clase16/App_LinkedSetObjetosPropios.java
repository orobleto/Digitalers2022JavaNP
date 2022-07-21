package com.edcuacionit.digitalers.Clase16;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Documento.TipoDocumento;
import com.edcuacionit.digitalers.entidades.Usuario;

public class App_LinkedSetObjetosPropios {
	public static void main(String[] args) {
		System.out.println("*****LINK******");
		Set<Usuario> usuarios = new LinkedHashSet<>();
		usuarios.add(new Usuario("user4", "ABC1234", new Documento(TipoDocumento.DNI, 1), LocalDate.parse("2022-09-28"),
				true));
		usuarios.add(new Usuario("user1", "ABC1234", new Documento(TipoDocumento.CI, 2), LocalDate.parse("2022-01-01"),
				true));
		usuarios.add(new Usuario("user1", "ABC1234", new Documento(TipoDocumento.CUIT, 3),
				LocalDate.parse("2022-03-15"), true));
		usuarios.add(new Usuario("user1", "ABC1234", new Documento(TipoDocumento.PAS, -4),
				LocalDate.parse("2019-12-24"), true));
		usuarios.add(new Usuario("user3", "ABC1234", new Documento(TipoDocumento.LE, 1), LocalDate.parse("2022-06-30"),
				false));
		usuarios.add(new Usuario("user5", "ABC1234", new Documento(TipoDocumento.CUIT, 1),
				LocalDate.parse("2021-02-01"), false));
		Iterator<Usuario> it = usuarios.iterator();

		while (it.hasNext()) {
			Usuario usuario = it.next();
			if (usuario.getCorreo().endsWith("6")) {
				it.remove();
			}
		}

		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}
