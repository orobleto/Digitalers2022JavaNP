package com.edcuacionit.digitalers.entidades;

import java.util.Arrays;

// una clase solo acepta modificador de acceso default public 
public class Alumno {
	private String nombre;
	private String apellido;
	private byte edad;
	private float nota;
	private boolean activo;
	public static String INSTITUTO = "Digitalers";
	private Curso[] cursos;

	public Alumno() {

	}

	public Alumno(String nombre, String apellido, byte edad, float nota, boolean activo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nota = nota;
		this.activo = activo;
	}

	public Alumno(String nombre, String apellido, byte edad, float nota, boolean activo, Curso[] cursos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nota = nota;
		this.activo = activo;
		this.cursos = cursos;
	}

	public String getAtributos() {
		String mensajeCursos = "";

		for (Curso curso : this.cursos) {
			mensajeCursos += " " + curso.getDescripcion();
		}

		return nombre + " " + apellido + " " + edad + " " + " " + nota + " " + activo + "[" + INSTITUTO + "]" + " "
				+ mensajeCursos;

	}

// formas de construir un objeto o inicializar	

	// crear metodos para acceder al dato el prefijo get + identificador del
	// atributo UpperCamelCase
	public String getNombre() {
		return nombre;
	}

	// verdad o falsedad
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	// crear un metodo para establecer o asignar el dato con el prefijo set +
	// identificador del atributo UpperCamelCase
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}

}
