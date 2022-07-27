package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Profesor {
	private Documento documento;
	private String razonSocial;
	private LocalDate fechaNacimiento;

	public Profesor() {
		super();
	}

	public Profesor(Documento documento, String razonSocial, LocalDate fechaNacimiento) {
		super();
		this.documento = documento;
		this.razonSocial = razonSocial;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String toString() {
		return "Profesor [" + documento + ", razonSocial=" + razonSocial + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	public int hashCode() {
		return Objects.hash(documento);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return Objects.equals(documento, other.documento);
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
