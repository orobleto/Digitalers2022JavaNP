package com.edcuacionit.digitalers.Clase17;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;

import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Documento.TipoDocumento;
import com.edcuacionit.digitalers.entidades.Usuario;
import com.edcuacionit.digitalers.eutilidades.ImprimirColeccion;

public class AppQueue {
	public static void main(String[] args) throws InterruptedException {
		long milisegundos = 2000;

		// Declarar Queue como colas
		// Declarar Deque como pilas y colas

		Deque<Usuario> usuarios = new ArrayDeque<>();
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

		int cont = 0;
		while (!usuarios.isEmpty()) {
			cont++;
			System.out.println("Por atender " + usuarios.peekLast().getCorreo());
			Thread.sleep(milisegundos);
			System.out.println("Atendiendo a " + usuarios.pollLast().getCorreo());
			Thread.sleep(milisegundos);
			if (cont == 3) {
				usuarios.offerLast(new Usuario("user857", "ABC1234", new Documento(TipoDocumento.CUIT, 1),
						LocalDate.parse("2021-02-01"), false));
			}

		}

		//

	}
}
