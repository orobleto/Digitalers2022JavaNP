package com.edcuacionit.digitalers.Clase16;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Usuario;
import com.edcuacionit.digitalers.entidades.Documento.TipoDocumento;

public class App_SetObjetosPropios {
	public static void main(String[] args) {

		System.out.println("*****SET******");
		Set<Usuario> usuarios = new HashSet<>();
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
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

	}
}
