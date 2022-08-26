package com.educaciontit.jdbc;

import java.util.List;

public interface DAO<E, K> {

	E buscarPorClavePrimaria(K k);

	boolean guardar(E e);

	boolean eliminar(E e);

	List<E> listar();

}
