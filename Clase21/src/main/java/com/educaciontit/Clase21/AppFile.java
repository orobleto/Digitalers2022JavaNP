package com.educaciontit.Clase21;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

/**
 * ORM Hibernate, MyBatis y EclipseLink
 *
 */
public class AppFile {
	public static File archivoLectura = new File(
			"C:" + File.separator + "Archivos Java Digitalers" + File.separator + "index.html");
	public static File archivoEscritura1 = new File(
			"C:" + File.separator + "Archivos Java Digitalers" + File.separator + "index1.html");
	public static File archivoEscritura2 = new File(
			"C:" + File.separator + "Archivos Java Digitalers" + File.separator + "index2.html");

	public static void main(String[] args) {

		String url = "C:" + File.separator + "Archivos Java Digitalers";
		File archivo = new File(url);

		System.out.println("ruta Absoluto: " + archivo.getAbsolutePath());
		System.out.println("Nombre: " + archivo.getName());
		System.out.println("Existe? " + archivo.exists());
		System.out.println("Se puede leer: " + archivo.canRead());
		System.out.println("Se puede escribir: " + archivo.canWrite());
		System.out.println("Es un archivo? " + archivo.isFile());
		System.out.println("Es un directorio? " + archivo.isDirectory());
		System.out.println("Esta oculto? " + archivo.isHidden());
		// 2022-08-26T19:56:34.389
		System.out.println("Ultima Modificacion con LocalDateTime: "
				+ Instant.ofEpochMilli(archivo.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
		System.out.println("Ultima Modificacion con Date: " + new Date(archivo.lastModified()));

		System.out.println("Lista de Elementos: " + Arrays.toString(archivo.list()));

		System.out.println("Lista de Elementos en Objetos File: ");

		leerDirectorio(archivo, 1);

		// crear archivo
		File archivoNuevo = new File(url + File.separator + "nuevo.txt");
		if (!archivoNuevo.exists()) {
			try {
				archivoNuevo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// eliminar un archivo
		File archivoAEliminar = new File(url + File.separator + "Nuevo documento de texto.txt");
		archivoAEliminar.delete();

		// crear un directorio
		File directorioNuevo = new File(url + File.separator + "Nuevo Directorio");
		directorioNuevo.mkdir();

	}

	// recursividad
	private static void leerDirectorio(File file, int i) {
		for (File fileHijo : file.listFiles()) {
			String cadena = "|";
			for (int j = 0; j < i; j++) {
				cadena += "_";
			}
			System.out.println(cadena + "" + fileHijo.getName());

			if (fileHijo.isDirectory()) {
				leerDirectorio(fileHijo, (i + 1));
			}
		}
	}

}
