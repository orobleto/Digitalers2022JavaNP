package com.edcuacionit.digitalers.Clase16;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Usuario;
import com.edcuacionit.digitalers.entidades.Documento.TipoDocumento;

public class App_treeSetObjetosPropios5 {
	public static void main(String[] args) {
		System.out.println("*****TREESET******");

		Set<Usuario> usuarios = new TreeSet<Usuario>(new Comparator<Usuario>() {
			public int compare(Usuario o1, Usuario o2) {
				return o2.getFechaCreacion().compareTo(o1.getFechaCreacion());
			}
		});
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
