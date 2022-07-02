package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;

public abstract class Empleado extends Persona {
	protected float sueldo;

	public Empleado() {
		super();
	}

	public Empleado(Documento documento, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo,
			float sueldo) {
		super(documento, nombre, apellido, fechaNacimiento, activo);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo + ", sueldo=" + sueldo + "]";
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
}
