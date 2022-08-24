package com.educaciontit.jdbc;

import java.util.List;

public interface DAO<E, K> {

	E buscarPorClavePrimaria(K k);

	boolean insertar(E e);

	boolean actualizar(E e);

	boolean eliminar(E e);

	List<E> listar();

}
