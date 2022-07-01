package com.edcuacionit.digitalers.Clase10;

import java.util.Arrays;

import com.edcuacionit.digitalers.entidades.Alumno;
import com.edcuacionit.digitalers.entidades.Documento;
import com.edcuacionit.digitalers.entidades.Persona;
import com.edcuacionit.digitalers.entidades.Profesor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Documento documento = new Documento("DNI", "95853000");

		Persona persona = new Persona();
		persona.setId(5);
		persona.setDocumento(documento);
		persona.setNombre("Octavio");
		persona.setApellido("Robleto");
		persona.setTelefono("50124479");
		persona.setDireccion("CABA");

		Alumno alumno = new Alumno();
		alumno.setDocumento(documento);
		alumno.setNombre("Analia");
		alumno.setApellido("Perez");
		alumno.setTelefono("50124480");
		alumno.setDireccion("Provincia");
		alumno.setCursos(new String[] { "Java", "HTML" });

		Profesor profesor = new Profesor();
		profesor.setDocumento(documento);
		profesor.setNombre("Rafael");
		profesor.setApellido("Jimenez");
		profesor.setTelefono("50124481");
		profesor.setDireccion("Santa FE");// Persona
		profesor.setSueldo(25.6f);// Empleado
		profesor.setTipo('F');// profesor
		profesor.getClass();// Object

		Profesor profesor2 = new Profesor(documento, "Ivanna", "Villalba", "5012", "Jujuy", 90.9f, 'C');

		System.out.println(persona);
		System.out.println(alumno);
		System.out.println(profesor);

		persona.guardar(); // persona.xls
		alumno.guardar(); // alumno.xls
		profesor.guardar(); // profesor.xls
		
		// final no debe cambiar nunca
		profesor.version();

	}
}
