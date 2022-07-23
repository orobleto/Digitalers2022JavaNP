package com.edcuacionit.digitalers.eutilidades;

import java.util.Collection;

public final class ImprimirColeccion {
	private ImprimirColeccion() {
	}

	public static <E> void imprimir(Collection<E> lista) {
		System.out.println(lista.size() + " elementos");
		for (E e : lista) {
			System.out.println(e);
		}
		System.out.println();
	}

}
