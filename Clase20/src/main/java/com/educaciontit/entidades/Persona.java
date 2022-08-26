package com.educaciontit.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Persona {
	protected Documento documento;
	protected String nombre;
	protected String apellido;
	protected Boolean activo;
	protected LocalDate fechaNacimiento;
	protected LocalDateTime fechaCreacion;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String nombre, String apellido, Boolean activo, LocalDate fechaNacimiento,
			LocalDateTime fechaCreacion) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.activo = activo;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaCreacion = fechaCreacion;
	}

	public String toString() {
		return "Persona [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", activo="
				+ activo + ", fechaNacimiento=" + fechaNacimiento + ", fechaCreacion=" + fechaCreacion + "]";
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

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
