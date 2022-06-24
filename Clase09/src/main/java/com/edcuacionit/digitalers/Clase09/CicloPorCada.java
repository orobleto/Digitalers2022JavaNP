package com.edcuacionit.digitalers.Clase09;

public class CicloPorCada {
	public static void main(String[] args) {
		String[] meses = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };

		System.out.println("Ciclo for comun");
		for (int i = 0; i < meses.length; i++) {
			String mes = meses[i];
			System.out.println(mes);
		}

		System.out.println("Ciclo for each");

		for (String mes : meses) {
			System.out.println(mes);	
			// break, continue;
		}

	}
}
