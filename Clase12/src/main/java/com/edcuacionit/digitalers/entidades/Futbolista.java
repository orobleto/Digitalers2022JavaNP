package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;

public class Futbolista extends Persona {

	private Byte numero;
	private String posicion;

	public Futbolista() {
		super();
	}

	public Futbolista(Documento documento, String nombre, String apellido, Direccion[] direccion,
			LocalDate fechaNacimiento, Boolean disponible, Byte numero, String posicion) {
		super(documento, nombre, apellido, direccion, fechaNacimiento, disponible);
		this.numero = numero;
		this.posicion = posicion;
	}

	public String toString() {

		return "Futbolista [" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", "
				+ Arrays.toString(direccion) + ", fechaNacimiento=" + fechaNacimiento + ", disponible=" + disponible
				+ ", numero=" + numero + ", posicion=" + posicion + "]";
	}

	public void jugar(Sede sede, LocalDate fecha) {
		System.out.println("Juega: " + sede + " " + fecha + " " + this);
	}

	public void entrenar(Sede sede, LocalDate fecha) {
		System.out.println("Entrena: " + sede + " " + fecha + " " + this);
	}

	public boolean asistir(Sede sede) {
		System.out.println(sede + " " + this);
		return true;
	}

	public Byte getNumero() {
		return numero;
	}

	public void setNumero(Byte numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
