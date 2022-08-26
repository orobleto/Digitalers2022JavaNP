package com.educaciontit.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Alumno extends Persona {
	private List<Curso> cursos;

	public Alumno() {
		super();
	}

	public Alumno(Documento documento, String nombre, String apellido, Boolean activo, LocalDate fechaNacimiento,
			LocalDateTime fechaCreacion, List<Curso> cursos) {
		super(documento, nombre, apellido, activo, fechaNacimiento, fechaCreacion);
		this.cursos = cursos;
	}

	public String toString() {
		return "Alumno [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", activo=" + activo
				+ ", fechaNacimiento=" + fechaNacimiento + ", fechaCreacion=" + fechaCreacion + ", cursos=" + cursos
				+ "]";
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
