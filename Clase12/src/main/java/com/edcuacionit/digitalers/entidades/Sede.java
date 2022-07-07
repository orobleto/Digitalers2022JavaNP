package com.edcuacionit.digitalers.entidades;

public final class Sede {
	private Direccion direccion;
	private String Equipo;

	public Sede() {
		super();
	}

	public Sede(Direccion direccion, String equipo) {
		super();
		this.direccion = direccion;
		Equipo = equipo;
	}

	public String toString() {
		return "Sede [" + direccion + ", Equipo=" + Equipo + "]";
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

}
