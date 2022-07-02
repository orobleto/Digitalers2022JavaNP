package com.edcuacionit.digitalers.interfaces;
// plantilla mucho mas generica

// DAO
// Base de Datos
// Impresora 
// servicios
// paradigma funciona
// paradigma POO
public interface Vinculo {
	// obligatorias

	Boolean desvincular();

	// public abstract
	Float pagar();

	default String nuevoVinculo() {
		return "He creado un nuevo vinculo";
	}
}
