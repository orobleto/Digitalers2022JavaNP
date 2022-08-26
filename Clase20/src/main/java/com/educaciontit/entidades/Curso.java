package com.educaciontit.entidades;

public final class Curso {
	private Long id;
	private String descripcion;
	private Boolean activo;

	public Curso() {
		super();
	}

	public Curso(Long id, String descripcion, Boolean activo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public String toString() {
		return "Curso [id=" + id + ", descripcion=" + descripcion + ", activo=" + activo + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
