package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;

import com.edcuacionit.digitalers.interfaces.Archivo;

public abstract class Persona implements Archivo{

	protected Documento documento;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaNacimiento;
	protected boolean activo;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Persona [" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", activo=" + activo + "]";
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

// metodo correcto generico para todas las clases
	public void imprimir(String nombreImpresora) {
		System.out.println("Imprimiendo en " + nombreImpresora);

	}
	
	// 
	public abstract void guardar();

}
