package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Entrenador extends Persona {
	private String matriculaFederacion;
	private LocalDate fechaInicio;

	public Entrenador() {
		super();
	}

	public Entrenador(Documento documento, String nombre, String apellido, Direccion[] direccion,
			LocalDate fechaNacimiento, Boolean disponible, String matriculaFederacion, LocalDate fechaInicio) {
		super(documento, nombre, apellido, direccion, fechaNacimiento, disponible);
		this.matriculaFederacion = matriculaFederacion;
		this.fechaInicio = fechaInicio;
	}

	public String toString() {
		return "Entrenador [" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", "
				+ Arrays.toString(direccion) + ", fechaNacimiento=" + fechaNacimiento + ", disponible=" + disponible
				+ ", matriculaFederacion=" + matriculaFederacion + ", fechaInicio=" + fechaInicio + "]";
	}


	public boolean asistir(Sede sede) {
		System.out.println(sede + " " + this);
		return true;
	}

	public void dirigir(Sede sede, LocalDate fecha) {
		System.out.println("Dirige: " + sede + " " + fecha + " " + this);
	}

	public String getMatriculaFederacion() {
		return matriculaFederacion;
	}

	public void setMatriculaFederacion(String matriculaFederacion) {
		this.matriculaFederacion = matriculaFederacion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

}
