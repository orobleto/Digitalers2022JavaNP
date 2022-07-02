package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class AlumnoTemporal extends Estudiante {
	private Boolean asistio;

	public AlumnoTemporal() {
		super();
	}

	public AlumnoTemporal(Documento documento, String nombre, String apellido, LocalDate fechaNacimiento,
			boolean activo, String[] cursos, Boolean asistio) {
		super(documento, nombre, apellido, fechaNacimiento, activo, cursos);
		this.asistio = asistio;
	}

	@Override
	public String toString() {
		return "AlumnoTemporal [cursos=" + Arrays.toString(cursos) + ", documento=" + documento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo
				+ ", asistio=" + asistio + "]";
	}

	public Boolean isAsistio() {
		return asistio;
	}

	public void setAsistio(Boolean asistio) {
		this.asistio = asistio;
	}

	@Override
	public void guardar() {
		System.out.println("guardando AlumnoTemporal");
		
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

	@Override
	public boolean insertarDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean guardarDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscarPorClave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscarTodos() {
		// TODO Auto-generated method stub
		return false;
	}

}
