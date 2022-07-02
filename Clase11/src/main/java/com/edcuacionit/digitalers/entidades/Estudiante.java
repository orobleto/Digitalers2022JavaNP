package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

import com.edcuacionit.digitalers.interfaces.BaseDeDatos;

public abstract class Estudiante extends Persona implements BaseDeDatos {
	protected String[] cursos;

	public Estudiante() {
		super();
	}

	public Estudiante(Documento documento, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo,
			String[] cursos) {
		super(documento, nombre, apellido, fechaNacimiento, activo);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Estudiante [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo + ", cursos=" + Arrays.toString(cursos)
				+ "]";
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

}
