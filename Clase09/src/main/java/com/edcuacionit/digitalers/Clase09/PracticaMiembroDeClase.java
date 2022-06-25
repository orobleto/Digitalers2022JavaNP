package com.edcuacionit.digitalers.Clase09;

import com.edcuacionit.digitalers.entidades.Curso;

public class PracticaMiembroDeClase {
	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setDescripcion("Java");
		// System.out.println(curso1.getAtributos());

		Curso curso2 = new Curso();
		curso2.setDescripcion("Introduccion a Base de Datos");

		System.out.println(curso1.getAtributos());
		System.out.println(curso2.getAtributos());

		

	}
}
