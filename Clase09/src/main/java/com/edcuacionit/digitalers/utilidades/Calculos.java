package com.edcuacionit.digitalers.utilidades;

public class Calculos {

	public static String version;
	public static long kilometros;
	public static final int MES_INICIO = 5;

	static {
		version = "V1";
		kilometros = 26399999;
	}

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int getAnioNacimiento(byte edad) {
		return 2022 - edad;
	}
}
