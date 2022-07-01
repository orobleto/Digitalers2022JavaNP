package com.edcuacionit.digitalers.Clase09;

import com.edcuacionit.digitalers.entidades.Alumno;
import com.edcuacionit.digitalers.entidades.Curso;

public class UsoDeObjetosPropiosEnOtrosObjetos {
	public static void main(String[] args) {

		Alumno alumno = new Alumno();
		alumno.setNombre("Octavio");
		alumno.setApellido("Robleto");
		alumno.setEdad((byte) 39);
		alumno.setNota(9.8f);
		alumno.setActivo(true);

		// Arreglo auxiliar 
		Curso[] cursos = new Curso[2];
		cursos[0] = new Curso();
		cursos[0].setDescripcion("Java");
		
		cursos[1] = new Curso();
		cursos[1].setDescripcion("Python");

		alumno.setCursos(cursos);
		
		System.out.println(alumno.getAtributos());

	}
}
