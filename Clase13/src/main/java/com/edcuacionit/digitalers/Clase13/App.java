package com.edcuacionit.digitalers.Clase13;

import java.time.LocalDate;

import com.edcuacionit.digitalers.entidades.CajaAhorro;
import com.edcuacionit.digitalers.entidades.CuentaCorrienta;
import com.edcuacionit.digitalers.entidades.Producto;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// mas adelante van a existir procesos automatizados en nuestro codigo

		// auto instancie
		Producto producto;

		producto = new CuentaCorrienta(1, "Pesos", LocalDate.parse("2020-01-01"), true, 1234);
		System.out.println(producto);
		producto.administrar();
		producto.cambiarEstadoProducto(false);
		System.out.println(producto);

		System.out.println();
		producto = new CajaAhorro(1, "Dolares", LocalDate.now(), false, 45697);
		System.out.println(producto);
		producto.administrar();
		producto.cambiarEstadoProducto(true);
		System.out.println(producto);

	}
}
