package com.edcuacionit.digitalers.entidades;

import javax.swing.JOptionPane;

public class Profesor extends Empleado {
	private char tipo; // C F

	public Profesor() {

	}

	public Profesor(Documento documento, String nombre, String apellido, String telefono, String direccion,
			float sueldo, char tipo) {
		super(documento, nombre, apellido, telefono, direccion, sueldo);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Profesor [toString()=" + super.toString() + ", tipo=" + tipo + "]";
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public void guardar() {
		JOptionPane.showMessageDialog(null, "guardando profesor");
	}
}
