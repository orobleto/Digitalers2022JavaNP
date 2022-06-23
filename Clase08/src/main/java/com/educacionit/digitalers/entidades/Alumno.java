package com.educacionit.digitalers.entidades;
import javax.swing.JOptionPane;

/**
 * Alumnos de educacion it
 * 
 * @author Octavio Robleto
 * @version 1.0
 */

// default public 
public class Alumno {
	// variables o atributos de instancia
	protected String nombre;
	String apellido;
	byte edad;
	private boolean activo;

	protected Alumno() {
		// algorirmos
	}
	
	private Alumno(String nombre){
		this.nombre = nombre;
	}
	
	

	Alumno(String nombre, String apellido, byte edad, boolean activo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.activo = activo;
	}

	void cambiarEstado(boolean activo) {

		// parametros o variables de bloque son locales
		this.activo = activo;
	}

	/**
	 * Metodo para ver el año de namcimiento
	 * 
	 * @return el año de nacimiento
	 */
 	private short anioNacimiento() {
		return (short) (2022 - edad);
	}

	protected void mostrarDatos() {
		String nombre;
		// variable local
		String descripcion = this.nombre + ", " + apellido + ", " + edad + ", "
				+ (activo ? "esta activo" : "esta inactivo") + " y nacio en " + this.anioNacimiento();
		JOptionPane.showMessageDialog(null, descripcion);
		
	}

	void activar() {
		activo = true;
	}

	void desactivar() {
		activo = false;
	}

}
