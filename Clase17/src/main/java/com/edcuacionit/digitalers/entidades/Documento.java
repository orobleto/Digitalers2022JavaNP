package com.edcuacionit.digitalers.entidades;

import java.util.Objects;

import com.edcuacionit.digitalers.eutilidades.UtilidadesCadena;

public final class Documento implements Comparable<Documento> {

	public enum TipoDocumento {
		DNI, PAS, CUIT, LE, CI;
	}

	private TipoDocumento tipo;
	private Integer numero;

	public Documento() {
		super();
	}

	public Documento(TipoDocumento tipo, Integer numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return UtilidadesCadena.converitObjetoJson(this, false);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, tipo);
	}

	@Override
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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public int compareTo(Documento documento) {
		int ordenTipo = this.tipo.ordinal() - documento.tipo.ordinal();
		if (ordenTipo == 0) {
			return this.numero - documento.numero;
		}
		return ordenTipo;
	}

}
