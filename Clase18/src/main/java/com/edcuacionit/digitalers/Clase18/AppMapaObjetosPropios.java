package com.edcuacionit.digitalers.Clase18;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Profesor;
import com.edcuacionit.digitalers.entidades.Documento.TipoDocumento;

public class AppMapaObjetosPropios {
	public static void main(String[] args) {
		Map<Documento, Profesor> profesores = new TreeMap<>();
		Profesor profesor1 = new Profesor(new Documento(TipoDocumento.CI, "01"), "Octavio Robleto",
				LocalDate.parse("1983-03-15"));
		Profesor profesor2 = new Profesor(new Documento(TipoDocumento.DNI, "02"), "Agustin Carrizo",
				LocalDate.parse("1983-03-15"));
		Profesor profesor3 = new Profesor(new Documento(TipoDocumento.DNI, "01"), "Sol Fanton",
				LocalDate.parse("1983-03-16"));

		profesores.put(profesor1.getDocumento(), profesor1);
		profesores.put(profesor2.getDocumento(), profesor2);
		profesores.put(profesor3.getDocumento(), profesor3);

		System.out.println("Iterando el mapa:");

		for (Entry<Documento, Profesor> profesor : profesores.entrySet()) {
			System.out.println(profesor.getValue());
		}

		System.out.println("Buscar a " + profesores.get(new Documento(TipoDocumento.valueOf("DNI"), "01")));
	}
}
