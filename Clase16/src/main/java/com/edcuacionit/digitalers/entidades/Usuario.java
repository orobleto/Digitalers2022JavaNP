package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario implements Comparable<Usuario> {// comparable debe ser utilizado para el orden natural

	private String correo;
	private String clave;
	private Documento documento;
	private LocalDate fechaCreacion;
	private boolean activo;

	public Usuario() {
		super();
	}

	public Usuario(String correo, String clave, Documento documento, LocalDate fechaCreacion, boolean activo) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.documento = documento;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", " + documento + ", fechaCreacion=" + fechaCreacion
				+ ", activo=" + activo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento);
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
		return Objects.equals(documento, other.documento);
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

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public int compareTo(Usuario usuario) {
		int numero = this.documento.compareTo(usuario.documento);
		System.out.println(numero);
		return numero;
	}

}
