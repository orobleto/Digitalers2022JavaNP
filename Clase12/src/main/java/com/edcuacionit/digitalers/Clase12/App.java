package com.edcuacionit.digitalers.Clase12;

import java.time.LocalDate;

import com.edcuacionit.digitalers.entidades.Direccion;
import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Entrenador;
import com.edcuacionit.digitalers.entidades.Futbolista;
import com.edcuacionit.digitalers.entidades.Persona;
import com.edcuacionit.digitalers.entidades.PersonalSalud;
import com.edcuacionit.digitalers.entidades.Sede;
import com.edcuacionit.digitalers.interfaces.Partido;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Persona[] personas = new Persona[3];

		Direccion direccion1 = new Direccion(true, "Nazca", (short) 3000, (byte) 0, "1");
		Futbolista futbolista = new Futbolista(new Documento("DNI", "95853351"), "Octavio", "Robleto",
				new Direccion[] { direccion1 }, LocalDate.parse("1983-03-15"), true, (byte) 1, "Delantero");

		Direccion direccion2 = new Direccion(false, "Corrientes", (short) 2563, (byte) 1, "H");
		Entrenador entrenador = new Entrenador(new Documento("PAS", "1569856A"), "Malena", "Montenegro",
				new Direccion[] { direccion2 }, LocalDate.parse("2000-01-27"), true, "ABC123",
				LocalDate.parse("2022-01-12"));

		Direccion direccion3 = new Direccion(false, "Cordoba", (short) 100, (byte) 15, "4");
		PersonalSalud personalSalud = new PersonalSalud(new Documento("CI", "9586322"), "Franco", "Benitez",
				new Direccion[] { direccion3 }, LocalDate.parse("1998-12-06"), false, "Medico Cirujano", (byte) 5,
				"M321ABC");

		personas[0] = futbolista;
		personas[1] = entrenador;
		personas[2] = personalSalud;
		Direccion direccion4 = new Direccion(true, "Qatar", (short) 0, (byte) 11, "ABC2");
		Sede sede = new Sede(direccion4, "QATAR CAMPUS");
		for (Persona persona : personas) {
			System.out.println(persona);
			System.out.println(persona.asistir(sede));
			System.out.println();
		}

		Object objeto = futbolista;

		Documento documento = (Documento) objeto;
		System.out.println(documento);
		

	}
}
