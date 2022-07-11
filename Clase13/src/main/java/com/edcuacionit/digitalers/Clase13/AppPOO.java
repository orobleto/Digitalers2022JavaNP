package com.edcuacionit.digitalers.Clase13;

import java.time.LocalDate;

import com.edcuacionit.digitalers.entidades.CajaAhorro;
import com.edcuacionit.digitalers.entidades.CuentaCorriente;
import com.edcuacionit.digitalers.entidades.Producto;

/**
 * Hello world!
 *
 */
public class AppPOO {
	public static void main(String[] args) {

		// mas adelante van a existir procesos automatizados en nuestro codigo

		// auto instancie
		Producto producto = null;

		try {
			producto = new CuentaCorriente(1, null, LocalDate.parse("2020-01-01"), true, 1234);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(producto);
		producto.administrar();
		producto.cambiarEstadoProducto(false);
		System.out.println(producto);

		System.out.println();
		try {
			producto = new CajaAhorro(1, "Dolares", LocalDate.now(), false, 45697);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(producto);
		producto.administrar();
		producto.cambiarEstadoProducto(true);
		System.out.println(producto);

	}
}
