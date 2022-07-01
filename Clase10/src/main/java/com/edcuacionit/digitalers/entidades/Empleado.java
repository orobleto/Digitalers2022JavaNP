package com.edcuacionit.digitalers.entidades;

public class Empleado extends Persona {
	private float sueldo;

	public Empleado() {

	}

	public Empleado(Documento documento, String nombre, String apellido, String telefono, String direccion,
			float sueldo) {
		super(documento, nombre, apellido, telefono, direccion);
		this.sueldo = sueldo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
