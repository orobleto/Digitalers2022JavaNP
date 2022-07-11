package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente() {
		super();

	}

	public CuentaCorriente(Integer numero, String moneda, LocalDate fechaAlta, boolean activo, Integer cbu) throws Exception {
		super(numero, moneda, fechaAlta, activo, cbu);

	}

	public String toString() {
		return "CuentaCorrienta [" + super.toString() + "]";
	}

	public void administrar() {
		System.out.println("Se administra con el equipo de Cuentas Corrientes");
	}
}
