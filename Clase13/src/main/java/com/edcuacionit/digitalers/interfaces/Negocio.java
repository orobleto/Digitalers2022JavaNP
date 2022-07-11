package com.edcuacionit.digitalers.interfaces;

import java.io.FileNotFoundException;

public interface Negocio {
	void administrar();

	boolean cambiarEstadoProducto(boolean estadoFinal);

// public void cargar(sin parametros) 
	// carga de archivos este metodo deberia implementar un FileReader
	void cargar() throws FileNotFoundException;
}
