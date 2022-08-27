package com.educaciontit.Clase21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		StringBuffer cadena = new StringBuffer();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(AppFile.archivoLectura))) {
			String linea;

			while ((linea = bufferedReader.readLine()) != null) {
				cadena.append(linea).append("\n");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(cadena);

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(AppFile.archivoEscritura2, true))) {
			bufferedWriter.write(cadena.toString());
			bufferedWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
