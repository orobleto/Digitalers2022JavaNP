package com.educacionit.digitalers.entidades;

public class Director {
	String descripcion;

	public Director() {
		
	}
	
	public Director(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public void mostrarAtributos() {
		System.out.println(descripcion);		
	}
	
}
