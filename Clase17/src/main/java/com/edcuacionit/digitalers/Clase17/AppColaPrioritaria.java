package com.edcuacionit.digitalers.Clase17;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Usuario;
import com.edcuacionit.digitalers.entidades.Documento.TipoDocumento;
import com.edcuacionit.digitalers.eutilidades.ImprimirColeccion;

public class AppColaPrioritaria {
	public static void main(String[] args) throws InterruptedException {

		Comparator<Usuario> ordenFecha = new Comparator<Usuario>() {
			public int compare(Usuario usuario1, Usuario usuario2) {
				return usuario1.getFechaCreacion().compareTo(usuario2.getFechaCreacion());
			}
		};

		Queue<Usuario> usuarios = new PriorityQueue<>(ordenFecha);
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

		System.out.println("Cola Prioritaria...");
		while (!usuarios.isEmpty()) {
			System.out.println("Proximo en atender " + usuarios.peek());
			Thread.sleep(2000);
			System.out.println("Atendiendo a " + usuarios.poll().getCorreo());
			Thread.sleep(2000);
		}

	}
}
