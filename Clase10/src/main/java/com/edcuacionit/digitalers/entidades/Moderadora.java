package com.edcuacionit.digitalers.entidades;

import java.util.Arrays;

public class Moderadora extends Empleado {
	private String[] salas;

	public Moderadora() {
		super();
	}

	public Moderadora(Documento documento, String nombre, String apellido, String telefono, String direccion,
			float sueldo, String[] salas) {
		super(documento, nombre, apellido, telefono, direccion, sueldo);
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Moderadora [toString()=" + super.toString() + ", salas=" + Arrays.toString(salas) + "]";
	}

	public String[] getSalas() {
		return salas;
	}

	public void setSalas(String[] salas) {
		this.salas = salas;
	}

}
