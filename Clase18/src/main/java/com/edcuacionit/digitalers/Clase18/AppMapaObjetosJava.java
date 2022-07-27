package com.edcuacionit.digitalers.Clase18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AppMapaObjetosJava {
	public static void main(String[] args) {
		Map<Integer, String> nombres = new HashMap<>();

		nombres.put(1, "Octavio");
		nombres.put(2, "Rafael");
		nombres.put(3, "Olga");
		nombres.put(4, "Malena");
		nombres.put(5, "Agustin");
		nombres.put(6, "Analia");
		nombres.put(null, "Oscar");

		System.out.println(nombres);

		System.out.println(nombres.get(5));
		System.out.println(nombres.containsValue("Octavio"));
		System.out.println(nombres.containsKey(11));

		for (Integer clave : nombres.keySet()) {
			System.out.println(nombres.get(clave));
		}

		Collection<String> nombresColeccion = nombres.values();
		System.out.println("*****************************");
		for (String nombre : nombresColeccion) {
			System.out.println(nombre);
		}

		System.out.println("***************Coleccion**************");
		System.out.println(nombres);
		System.out.println(nombres.keySet());
		System.out.println(nombres.values());
		System.out.println(nombres.entrySet());
		System.out.println("***************Entry**************");
		for (Entry<Integer, String> nombresES : nombres.entrySet()) {
			String nombre = nombresES.getValue();
			System.out.println(nombresES.getKey() + "->" + nombre);
			if (nombre.startsWith("M")) {
				nombresES.setValue(nombre.toUpperCase());
				System.out.println("se modifico la clave " + nombresES.getKey());
			}
		}

		System.out.println(nombres);

	}
}
