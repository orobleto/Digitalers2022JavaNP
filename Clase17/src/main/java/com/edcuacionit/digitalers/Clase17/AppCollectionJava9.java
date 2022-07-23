package com.edcuacionit.digitalers.Clase17;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.edcuacionit.digitalers.eutilidades.ImprimirColeccion;

public class AppCollectionJava9 {

	public static void main(String[] args) {

		// Cualquier version Java
		List<String> nombres = Arrays.asList("Octavio", "Sol", "Oscar", "Malena");
		// new String[]{"","","",""}

		ImprimirColeccion.imprimir(nombres);

		nombres.set(2, "Ezequiel");

		ImprimirColeccion.imprimir(nombres);

		// nombres.add("felix");

		// ImprimirColeccion.imprimir(nombres);

		// Java 9

		List<Integer> numeros = List.of(1, 5, 8, 9, 10);

		ImprimirColeccion.imprimir(numeros);

		// numeros.add(99);

		// ImprimirColeccion.imprimir(numeros);

		Set<String> apellidos = Set.of("Robleto", "Bracho", "Fanton", "Gonzalez", "Robleto");

		ImprimirColeccion.imprimir(apellidos);
	}
}
