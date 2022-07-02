package com.edcuacionit.digitalers.interfaces;

public interface Archivo {
	// metodos abstractos
	// constantes de clase

	String TIPO =".txt";
	
	// comentame
	
	boolean generar(String nombre);

	boolean cargar(String directorio);

}
