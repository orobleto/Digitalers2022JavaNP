package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class AlumnoFijo extends Estudiante {
	private String carrera;

	public AlumnoFijo() {
		super();
	}

	public AlumnoFijo(Documento documento, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo,
			String[] cursos, String carrera) {
		super(documento, nombre, apellido, fechaNacimiento, activo, cursos);
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "AlumnoFijo [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo + ", cursos=" + Arrays.toString(cursos)
				+ ", carrera=" + carrera + "]";
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public void guardar() {
		System.out.println("guardando AlumnoFijo");
		
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
