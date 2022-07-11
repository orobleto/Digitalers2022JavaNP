package com.edcuacionit.digitalers.Clase13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class AppCheckedExceptions {
	public static void main(String[] args) {
		System.out.println("Incio del programa");
		try {
			FileReader fileReader = new FileReader("c:archivos");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Fin del Programa");
	}
}
