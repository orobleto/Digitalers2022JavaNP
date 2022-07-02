package com.edcuacionit.digitalers.Clase11;

import com.edcuacionit.digitalers.entidades.Empleado;
import com.edcuacionit.digitalers.entidades.Profesor;
import com.edcuacionit.digitalers.interfaces.BaseDeDatos;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Profesor profesor = new Profesor();
		profesor.guardar();
		System.out.println(profesor.nuevoVinculo());

		BaseDeDatos.conectar();
		System.out.println(BaseDeDatos.motor);

	}

}
