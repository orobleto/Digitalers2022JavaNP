package com.edcuacionit.digitalers.Clase13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AppTCF {
	public static void main(String[] args) {
		FileReader file = null;
		try {
			file = new FileReader("C:\\Users\\Boreal\\Desktop\\Libro1.xlsx");
			file.read();
			JOptionPane.showConfirmDialog(null, "Pulsa la tecla para continuar");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		JOptionPane.showConfirmDialog(null, "Pulsa otra tecla para continuar");
		System.out.println("fin");

	}
}
