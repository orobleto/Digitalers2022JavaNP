package com.edcuacionit.digitalers.Clase15;

import java.util.HashSet;
import java.util.Set;

public class AppHashSet {
	public static void main(String[] args) {
		// no permite elementos repitos

		Set<String> nombres = new HashSet<>();
		HashSet<String> apellidos = new HashSet<>();

		// arreglo[i] = ""

		System.out.println(nombres.add("Octavio"));
		System.out.println(nombres.add("Sol"));
		System.out.println(nombres.add("Matias"));
		System.out.println(nombres.add("Malena"));
		System.out.println(nombres.add("Malena"));

		apellidos.add("Robleto");
		apellidos.add("Acevedo");
		System.out.println(nombres);

		nombres.addAll(apellidos);
		System.out.println(nombres);

		System.out.println(apellidos.size());

		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		System.out.println(nombres.remove("Octavio"));

		System.out.println(nombres);

		Set<String> nombres2 = new HashSet<>();
		nombres2.add("Acevedo");
		nombres2.add("Matias");
		nombres2.add("Rafael");

		System.out.println(nombres.removeAll(nombres2));

		System.out.println("**************");
		System.out.println(nombres);
		nombres.clear();
		System.out.println(nombres);

		System.out.println(apellidos.contains("Acevedo"));

		// Frameworks o librerias que no aceptan las colecciones
		Object[] objetos = nombres2.toArray();
		System.out.println("-------------------------------");
		for (int i = 0; i < objetos.length; i++) {
			System.out.println(objetos[i]);
		}

		String[] nombres3 = nombres2.toArray(new String[nombres.size()]);

		System.out.println("################################");
		for (String nombre : nombres3) {
			System.out.println(nombre);
		}

		
		
		

	}

	public static <E> E getObjeto(E e) {
		System.out.println("<" + e + ">");
		return e;
	}

}
