package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Arrays;
// clase abstracta vinculo
// pagar, desvincular proveedor
// metodo pagar, desvincular
// Persona es abs -> Empleado es abs

import com.edcuacionit.digitalers.interfaces.Vinculo;

//class nombre extends interface
public class Profesor extends Empleado implements Vinculo {
	private String[] cursos;

	public Profesor() {
		super();
	}

	public Profesor(Documento documento, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo,
			float sueldo, String[] cursos) {
		super(documento, nombre, apellido, fechaNacimiento, activo, sueldo);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", documento=" + documento + ", nombre=" + nombre + ", apellido="
				+ apellido + ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo + ", curso="
				+ Arrays.toString(cursos) + "]";
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public void imprimir(String nombreImpresora) {

		System.out.println("Estoy imprimiendo un profesor en: " + nombreImpresora);
		;
	}

	@Override
	public void guardar() {
		System.out.println("guardando profesor");

	}

	@Override
	public Boolean desvincular() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Float pagar() {
		// TODO Auto-generated method stub
		return 0.0f;
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

}
