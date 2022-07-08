package com.edcuacionit.digitalers.entidades;

import java.time.LocalDate;

public abstract class Cuenta extends Producto {
	private Integer cbu;

	public Cuenta() {
		super();
	}

	public Cuenta(Integer numero, String moneda, LocalDate fechaAlta, boolean activo, Integer cbu) {
		super(numero, moneda, fechaAlta, activo);
		this.cbu = cbu;
	}

	public String toString() {
		return "Cuentas [" + super.toString() + ", cbu=" + cbu + "]";
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

}
