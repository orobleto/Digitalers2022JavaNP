package com.edcuacionit.digitalers.entidades;

import java.util.Objects;

// nadie puede heredar
public final class Documento implements Comparable<Documento> {

	//
	private String[] tipos = { "DNI", "PAS", "LE", "CUIT", "CI" };

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
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
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

	// DNI PAS CUIT LE CI --> orden exigido

	public int compareTo(Documento documento) {
		int ordenTipo = getIndiceTipos(this.tipo.name()) - getIndiceTipos(documento.tipo.name());
		// int ordenTipo = this.tipo.compareTo(documento.tipo);
		// int ordenTipo = this.tipo.name().compareTo(documento.tipo.name());
		if (ordenTipo == 0) {
			return this.numero - documento.numero;
		}
		return ordenTipo;
	}

	private int getIndiceTipos(String tipoDocumento) {
		for (int i = 0; i < tipos.length; i++) {
			if (tipos[i] == tipoDocumento) {
				return i;
			}
		}
		return tipos.length;

	}

}

// 

// DNI CI PAS LE CUIT

// CI CUIT DNI LE PAS--> orden natural

// DNI PAS CUIT LE CI --> orden exigido 

// CC CA TC PF FCI PR  
