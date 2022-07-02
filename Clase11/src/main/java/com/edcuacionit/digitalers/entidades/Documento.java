package com.edcuacionit.digitalers.entidades;

import com.edcuacionit.digitalers.interfaces.Archivo;
import com.edcuacionit.digitalers.interfaces.Vinculo;

// simula una herencia
public final class Documento implements Vinculo, Archivo {
	private String tipo;
	private String numero;

	@Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}

	public Documento() {
		super();
	}

	public Documento(String tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public boolean generar(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cargar(String directorio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean desvincular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float pagar() {
		// TODO Auto-generated method stub
		return null;
	}

}
