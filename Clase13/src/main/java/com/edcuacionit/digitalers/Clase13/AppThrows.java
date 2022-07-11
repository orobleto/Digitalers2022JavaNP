package com.edcuacionit.digitalers.Clase13;

import java.io.FileNotFoundException;

import com.edcuacionit.digitalers.entidades.CajaAhorro;
import com.edcuacionit.digitalers.entidades.Cuenta;
import com.edcuacionit.digitalers.entidades.Producto;

public class AppThrows {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Incio");
		Producto producto = new CajaAhorro();
		producto.cargarArchivoProducto();
		System.out.println("Fin");

		Cuenta cuenta = new CajaAhorro();
		cuenta.cargar();

	}
}
