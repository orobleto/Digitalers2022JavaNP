package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;

import com.edcuacionit.digitalers.interfaces.Negocio;

public abstract class Producto implements Negocio {
	private Integer numero;
	private String moneda;
	private LocalDate fechaAlta;
	private boolean activo;

	public Producto() {
		super();
	}

	public Producto(Integer numero, String moneda, LocalDate fechaAlta, boolean activo) {
		super();
		this.numero = numero;
		this.moneda = moneda;
		this.fechaAlta = fechaAlta;
		this.activo = activo;
	}

	public String toString() {
		return "Producto [numero=" + numero + ", moneda=" + moneda + ", fechaAlta=" + fechaAlta + ", activo=" + activo
				+ "]";
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	//	el retorno del booleano indica si pudo realizar las operaciones
	public boolean cambiarEstadoProducto(boolean estadoFinal) {
		System.out.println("Informar al banco central que quedo " + (estadoFinal ? "activo" : "inactivo")
				+ " el producto " + numero);
		System.out.println(
				"Informar al AFIP que se dio de " + (estadoFinal ? "alta" : "baja") + " el producto " + numero);
		setActivo(estadoFinal);
		return estadoFinal;
	}

}
