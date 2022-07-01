package com.edcuacionit.digitalers.entidades;

import java.util.Arrays;

public class Alumno extends Persona {

	private String[] cursos;

	public Alumno() {

	}

	public Alumno(Documento documento, String nombre, String apellido, String telefono, String direccion,
			String[] cursos) {
		super(documento, nombre, apellido, telefono, direccion);
		this.cursos = cursos;
	}



	@Override
	public String toString() {
		return "Alumno [getId()=" + getId() + ", getDocumento()=" + getDocumento() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getTelefono()=" + getTelefono() + ", getDireccion()="
				+ getDireccion() + ", cursos=" + Arrays.toString(cursos) + "]";
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	// un hermano de la sobrecargar
	public void guardar() {
		System.out.println("guardando alumno...");
		
	}

	

}
