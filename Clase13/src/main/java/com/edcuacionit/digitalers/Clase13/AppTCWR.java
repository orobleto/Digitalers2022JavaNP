package com.edcuacionit.digitalers.Clase13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AppTCWR {
	public static void main(String[] args) {
		
		// implements autoclosebale
		try (FileReader file = new FileReader("C:\\Users\\Boreal\\Desktop\\Libro1.xlsx")) {

			JOptionPane.showConfirmDialog(null, "Pulsa la tecla para continuar");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		
		JOptionPane.showConfirmDialog(null, "Pulsa la tecla para continuar");
	}
}
