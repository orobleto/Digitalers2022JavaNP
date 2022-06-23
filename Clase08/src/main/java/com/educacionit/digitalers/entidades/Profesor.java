package com.educacionit.digitalers.entidades;

public class Profesor {
	String descripcion;
	byte edad;
	boolean activo;

	Profesor() {

	}

	public Profesor(String descripcion, byte edad) {
		super();
		this.descripcion = descripcion;
		this.edad = edad;
	}

	public Profesor(String descripcion, byte edad, boolean activo) {
		this.descripcion = descripcion;
		this.edad = edad;
		this.activo = activo;
	}

	public String mostrarDatos() {
		return "Descripcion: " + descripcion + ", edad: " + edad + ", esta " + (activo ? "Activo" : "Inactivo");
	}

	public int obtenerAnioNacimiento() {
		return 2022 - edad;
	}
}
