package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;

public class CuentaCorrienta extends Cuenta {

	public CuentaCorrienta() {
		super();

	}

	public CuentaCorrienta(Integer numero, String moneda, LocalDate fechaAlta, boolean activo, Integer cbu) {
		super(numero, moneda, fechaAlta, activo, cbu);

	}

	public String toString() {
		return "CuentaCorrienta [" + super.toString() + "]";
	}

	public void administrar() {
		System.out.println("Se administra con el equipo de Cuentas Corrientes");
	}
}
