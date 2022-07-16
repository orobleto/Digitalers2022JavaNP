package com.edcuacionit.digitalers.Clase15;

// K -->  Integer y P -> Usuario
public class Generico<K, P> {
	private K dato1;
	private P dato2;

	@Override
	public String toString() {
		return "Generico [dato1=" + dato1 + ", dato2=" + dato2 + "]";
	}

	public K getDato1() {
		return dato1;
	}

	public void setDato1(K dato1) {
		this.dato1 = dato1;
	}

	public P getDato2() {
		return dato2;
	}

	public void setDato2(P dato2) {
		this.dato2 = dato2;
	}

}
