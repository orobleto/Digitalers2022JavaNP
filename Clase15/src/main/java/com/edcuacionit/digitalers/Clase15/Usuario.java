package com.edcuacionit.digitalers.Clase15;

import java.util.Objects;

public class Usuario {
	private String correo;
	private Integer clave;

	public Usuario() {
		super();
	}

	public Usuario(String correo, Integer clave) {
		super();
		this.correo = correo;
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + "]";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clave, correo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(clave, other.clave) && Objects.equals(correo, other.correo);
	}

}
