package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;

public class CajaAhorro extends Cuenta {

	public CajaAhorro() {
		super();

	}

	public CajaAhorro(Integer numero, String moneda, LocalDate fechaAlta, boolean activo, Integer cbu)
			throws Exception {
		super(numero, moneda, fechaAlta, activo, cbu);

	}

	public String toString() {
		return "CajaAhorro [" + super.toString() + "]";
	}

	public void administrar() {
		System.out.println("Se administra con el equipo de Cajas de Ahorro");
	}

}
