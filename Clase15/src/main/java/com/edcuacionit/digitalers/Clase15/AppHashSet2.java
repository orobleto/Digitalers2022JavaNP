package com.edcuacionit.digitalers.Clase15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppHashSet2 {
	public static void main(String[] args) {
		Set<String> nombres = new HashSet<>();

		nombres.add("Sol");
		nombres.add("Octavio");
		nombres.add("Matias");
		nombres.add("Malena");
		nombres.add("Rafael");

		System.out.println(nombres);

		System.out.println("********************");

		Iterator<String> iterator = nombres.iterator();

		while (iterator.hasNext()) {
			String nombre = iterator.next();
			System.out.println(nombre);
			if (nombre.startsWith("M")) {
				iterator.remove();
			}
		}

		System.out.println(nombres);

	}
}
