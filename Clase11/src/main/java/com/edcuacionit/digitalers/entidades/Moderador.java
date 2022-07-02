package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Moderador extends Empleado {
	private String[] reuniones;

	public Moderador() {
		super();
	}

	public Moderador(Documento documento, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo,
			float sueldo, String[] reuniones) {
		super(documento, nombre, apellido, fechaNacimiento, activo, sueldo);
		this.reuniones = reuniones;
	}

	public String toString() {
		return "Moderador [sueldo=" + sueldo + ", documento=" + documento + ", nombre=" + nombre + ", apellido="
				+ apellido + ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo + ", reuniones="
				+ Arrays.toString(reuniones) + "]";
	}

	public String[] getReuniones() {
		return reuniones;
	}

	public void setReuniones(String[] reuniones) {
		this.reuniones = reuniones;
	}

	@Override
	public void guardar() {
		System.out.println("guardando un moderador");
		
	}

	@Override
	public boolean generar(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cargar(String directorio) {
		// TODO Auto-generated method stub
		return false;
	}

}
