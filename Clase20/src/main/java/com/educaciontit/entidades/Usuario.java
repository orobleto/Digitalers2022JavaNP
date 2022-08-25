package com.educaciontit.entidades;

import java.time.LocalDateTime;

//POJO - 
public class Usuario {
	private String correo;
	private String clave;
	private Boolean activo;
	private LocalDateTime fechaCreacion;

	public Usuario() {
		super();
	}

	public Usuario(String correo, String clave, Boolean activo, LocalDateTime fechaCreacion) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}

	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", activo=" + activo + ", fechaCreacion="
				+ fechaCreacion + "]";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	

}
