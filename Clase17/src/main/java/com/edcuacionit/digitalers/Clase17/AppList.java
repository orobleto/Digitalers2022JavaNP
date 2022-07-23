package com.edcuacionit.digitalers.Clase17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Usuario;
import com.edcuacionit.digitalers.eutilidades.ImprimirColeccion;
import com.edcuacionit.digitalers.entidades.Documento.TipoDocumento;

public class AppList {
	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<Usuario>(4);
		usuarios.add(new Usuario("user4", "ABC1234", new Documento(TipoDocumento.DNI, 1), LocalDate.parse("2022-09-28"),
				true));
		usuarios.add(new Usuario("user85", "ABC1234", new Documento(TipoDocumento.CI, 2), LocalDate.parse("2022-01-01"),
				true));
		usuarios.add(new Usuario("user10", "ABC1234", new Documento(TipoDocumento.CUIT, 1),
				LocalDate.parse("2022-03-15"), true));
		usuarios.add(new Usuario("user16", "ABC1234", new Documento(TipoDocumento.PAS, -4),
				LocalDate.parse("2019-12-24"), true));
		usuarios.add(new Usuario("user3", "ABC1234", new Documento(TipoDocumento.LE, 1), LocalDate.parse("2022-06-30"),
				false));
		usuarios.add(new Usuario("user5", "ABC1234", new Documento(TipoDocumento.CUIT, 1),
				LocalDate.parse("2021-02-01"), false));

		ImprimirColeccion.imprimir(usuarios);

		usuarios.add(1, new Usuario("user6", "ABC123456", new Documento(TipoDocumento.PAS, 856),
				LocalDate.parse("1980-02-01"), false));
		ImprimirColeccion.imprimir(usuarios);

		usuarios.set(2, new Usuario("user69", "ABC1234569", new Documento(TipoDocumento.CI, 99),
				LocalDate.parse("1936-06-01"), false));

		ImprimirColeccion.imprimir(usuarios);

		Usuario usuario = new Usuario();
		usuario.setDocumento(new Documento(TipoDocumento.CUIT, 1));
		System.out.println(usuarios.indexOf(usuario));

		System.out.println(usuarios.lastIndexOf(usuario));

		ImprimirColeccion.imprimir(usuarios.subList(2, 4));

		System.out.println("*************************************");

		for (int i = 0; i < usuarios.size(); i++) {
			Usuario usuarioAux = usuarios.get(i);
			if (usuarioAux.getCorreo().equalsIgnoreCase("user16")) {
				usuarios.remove(i);
			}
		}

		ImprimirColeccion.imprimir(usuarios);

		/*
		 * for (Usuario usuarioAux : usuarios) { if
		 * (usuarioAux.getCorreo().equalsIgnoreCase("user10")) {
		 * usuarios.remove(usuarioAux); } }
		 * 
		 * ImprimirColeccion.imprimirLista(usuarios);
		 */
		ListIterator<Usuario> listIT = usuarios.listIterator();

		while (listIT.hasNext()) {
			Usuario usuarioAux = listIT.next();
			if (usuarioAux.getFechaCreacion().isAfter(LocalDate.parse("2021-01-01"))) {
				listIT.remove();
			}
		}
		ImprimirColeccion.imprimir(usuarios);
		System.out.println("De regreso");
		while (listIT.hasPrevious()) {
			System.out.println(listIT.previous());
		}

		System.out.println("De regreso");
		for (int i = usuarios.size() - 1; i >= 0; i--) {
			System.out.println(usuarios.get(i));

		}

	}

}
