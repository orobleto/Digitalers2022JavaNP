package com.edcuacionit.digitalers.interfaces;

public interface BaseDeDatos extends Busqueda {
// constante
	
	String motor= "Access";
	boolean insertarDB();

	boolean guardarDB();

	boolean eliminarDB();

	// metodos miembros de clase
	static void conectar() {
		System.out.println("Se conecto a la base de datos");
	}

}
