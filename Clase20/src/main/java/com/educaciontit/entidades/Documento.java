package com.educaciontit.entidades;

import com.educaciontit.enumerados.TiposDocumento;

public final class Documento {
	private TiposDocumento tipo;
	private String numero;

	public Documento() {
		super();
	}

	public Documento(TiposDocumento tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}

	public TiposDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TiposDocumento tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
