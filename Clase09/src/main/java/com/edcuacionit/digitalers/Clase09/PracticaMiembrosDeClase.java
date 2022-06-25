package com.edcuacionit.digitalers.Clase09;

import com.edcuacionit.digitalers.entidades.Alumno;
import com.edcuacionit.digitalers.utilidades.Calculos;

public class PracticaMiembrosDeClase {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Octavio", "robleto", (byte) 39, 5.6f, false);
		Alumno alumno2 = new Alumno("Analia", "Perez", (byte) 29, 5.9f, true);

		System.out.println(alumno1.getAtributos() + " - " + Alumno.instituto);

		System.out.println(alumno2.getAtributos() + " - " + Alumno.instituto);

		Alumno.instituto = "Educacion IT";
		System.out.println(alumno1.getAtributos() + " - " + Alumno.instituto);

		System.out.println(alumno2.getAtributos() + " - " + Alumno.instituto);
		Alumno.instituto = "Telecom";

		System.out.println(alumno1.getAtributos() + " - " + Alumno.instituto);

		System.out.println(alumno2.getAtributos() + " - " + Alumno.instituto);

		System.out.println(Calculos.suma(2, 6));

		System.out.println(Calculos.getAnioNacimiento(alumno1.getEdad()));

	}
	
	public static int suma() {
		return 0;
	}
}
