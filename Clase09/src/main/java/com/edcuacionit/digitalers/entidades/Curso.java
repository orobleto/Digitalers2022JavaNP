package com.edcuacionit.digitalers.entidades;

// crear una clase curso que tenga un autoincrementable -- asigne un id unico ascendente
public class Curso {
	private int id;
	private String descripcion;
	private static int contador;

	static {
		contador = 0;
	}

	public Curso() {
		contador++;
		id = contador;

	}

	public String getAtributos() {
		return "ID: " + id + " y Contador: " + contador + ", Descripcion: " + descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
