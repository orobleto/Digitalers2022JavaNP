package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

import com.edcuacionit.digitalers.interfaces.Partido;

public abstract class Persona implements Partido {
	protected Documento documento;
	protected String nombre;
	protected String apellido;
	protected Direccion[] direccion;
	protected LocalDate fechaNacimiento;
	protected Boolean disponible;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String nombre, String apellido, Direccion[] direccion,
			LocalDate fechaNacimiento, Boolean disponible) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.disponible = disponible;
	}


	public String toString() {
		
		return "Persona [" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", "
				+ Arrays.toString(direccion) + ", fechaNacimiento=" + fechaNacimiento + ", disponible=" + disponible
				+ "]";
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion[] getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion[] direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

}
