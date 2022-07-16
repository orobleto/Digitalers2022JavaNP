package com.edcuacionit.digitalers.Clase15;

public class App {
	public static void main(String[] args) throws Exception {
		// Documento
		GenericoDoble documento = new GenericoDoble();
		documento.setDato1("DNI");
		documento.setDato2("95001001");

		GenericoDoble telefono = new GenericoDoble();
		telefono.setDato1("+54");
		telefono.setDato2(50124479);

		GenericoDoble direccion = new GenericoDoble();
		direccion.setDato1("1416");
		direccion.setDato2("Cesar Diaz");

		System.out.println(telefono.getDato1().getClass());

		System.out.println(telefono.getDato2().getClass());

		if (documento.getDato1().getClass() != String.class) {
			throw new Exception("error no es una cadena de caracteres");
		}

		Generico<String, String> documento1 = new Generico<String, String>();
		documento1.setDato1("DNI");
		documento1.setDato2("95001001");
		System.out.println(documento1);

		Generico<String, Integer> telefono1 = new Generico<String, Integer>();
		telefono1.setDato1("+54");
		telefono1.setDato2(50124479);
		System.out.println(telefono1.getDato2());

		Generico<Object, Object> generico = new Generico<>();
		
		

	}
}
