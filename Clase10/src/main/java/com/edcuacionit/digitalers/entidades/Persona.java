package com.edcuacionit.digitalers.entidades;

public class Persona extends EntidadGenerica {
// id es de generica
	private Documento documento;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;

	public Persona() {

	}

	public Persona(Documento documento, String nombre, String apellido, String telefono, String direccion) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", direccion=" + direccion + "]";
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void guardar() { //
		System.out.println("guardando persona...");
	}
	
	// miembro instancia 
	public final String version() {
		return "VERSION PERSONA 3.0";
	}

}
