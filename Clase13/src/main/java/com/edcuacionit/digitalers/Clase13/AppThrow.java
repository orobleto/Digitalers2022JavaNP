package com.edcuacionit.digitalers.Clase13;

import java.time.LocalDate;

import com.edcuacionit.digitalers.entidades.CajaAhorro;
import com.edcuacionit.digitalers.entidades.Producto;

// clase que manejamos en el front de la pagina web
public class AppThrow {
	public static void main(String[] args) {
		Producto producto = new CajaAhorro();
		try {
			producto.setFechaAlta(LocalDate.parse("2025-07-08"));
		} catch (Exception e) {
			System.out.println("Debe ingresar una fecha anterior a la actual " + e.getMessage());
		}
	}
}
