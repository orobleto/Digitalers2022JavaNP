package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class PersonalSalud extends Persona {
	private String titulo;
	private Byte aniosExperiencia;
	private String matricula;

	public PersonalSalud() {
		super();
	}

	public PersonalSalud(Documento documento, String nombre, String apellido, Direccion[] direccion,
			LocalDate fechaNacimiento, Boolean disponible, String titulo, Byte aniosExperiencia, String matricula) {
		super(documento, nombre, apellido, direccion, fechaNacimiento, disponible);
		this.titulo = titulo;
		this.aniosExperiencia = aniosExperiencia;
		this.matricula = matricula;
	}

	public String toString() {
		return "PersonalSalud [" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", "
				+ Arrays.toString(direccion) + ", fechaNacimiento=" + fechaNacimiento + ", disponible=" + disponible
				+ ", titulo=" + titulo + ", aniosExperiencia=" + aniosExperiencia + ", matricula=" + matricula + "]";
	}

	public void tratar(Persona persona, Sede sede, LocalDate fecha) {
		System.out.println("Tratando a: " + persona.getNombre() + " " + sede + " " + fecha + " " + this);
	}

	public boolean asistir(Sede sede) {
		System.out.println(sede + " " + this);
		return true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Byte getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(Byte aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
