package com.educacionit.jdbc;

import java.util.List;

public interface GenericDAO<E, ID> {
	// miembros de clase constantes
	String JDBC = "MariaBD";

	public abstract E findById(ID id);

	Boolean save(E e);

	Boolean delete(E e);

	List<E> findAll();

	default void print() {
		System.out.println("print - " + this);
	}

	static String getUserConnection() {
		//emptyuser();
		return "root";
	}
	/*
	 * desde java 9 se permiten metodos de clase privados para complementar private
	 * static Boolean emptyuser() { return false; }
	 */
}
