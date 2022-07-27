package com.edcuacionit.digitalers.entidades;
//

import java.util.Objects;

public class Documento implements Comparable<Documento> {
	public static enum TipoDocumento {
		DNI("Documento Nacional de Identidad"), CI("Cedula de Identidad"), PAS("Pasaporte");

		private String descripcion;

		private TipoDocumento(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getDescripcion() {
			return descripcion;
		}
	}

	private TipoDocumento tipo;
	private String numero;

	public Documento() {
		super();
	}

	public Documento(TipoDocumento tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public String toString() {
		return "Documento [" + tipo + " " + tipo.getDescripcion() + ": " + numero + "]";
	}

	public int hashCode() {
		return Objects.hash(numero, tipo);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		return Objects.equals(numero, other.numero) && tipo == other.tipo;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int compareTo(Documento documento) {
		int tipo = this.tipo.name().compareTo(documento.tipo.name());
		if (tipo != 0) {
			return tipo;
		}
		return this.numero.compareTo(documento.numero);
	}

}
