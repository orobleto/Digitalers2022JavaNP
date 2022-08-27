package com.educaciontit.Clase21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppFileReaderWriter {
	public static void main(String[] args) {
		StringBuffer cadena = new StringBuffer();

		// leemos
		try (FileReader fileReader = new FileReader(AppFile.archivoLectura)) {
			int ascii;

			while ((ascii = fileReader.read()) != -1) {
				cadena.append((char) ascii);
				// System.out.print((char) ascii);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println(cadena);

		try (FileWriter fileWriter = new FileWriter(AppFile.archivoEscritura1, false)) {
			for (int i = 0; i < cadena.length(); i++) {
				fileWriter.write(cadena.charAt(i));
			}
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
