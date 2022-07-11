package com.edcuacionit.digitalers.Clase13;

import javax.swing.JOptionPane;

public class AppTryCatchFinally {
	public static void main(String[] args) {
		System.out.println("Inicio del programa");

		try {
			// escribir el codigo que se supone se debe hacer en un flujo normal
			Integer numeroA = Integer.valueOf(JOptionPane.showInputDialog("Indica numerador numero"));
			Integer numeroB = Integer.valueOf(JOptionPane.showInputDialog("Indica denominador numero"));
			JOptionPane.showMessageDialog(null, "La division es: " + (numeroA / numeroB));
			numeroA = null;
			numeroA.getClass();

		} catch (NumberFormatException | NullPointerException e) {
			System.out.println("Solo se aceptan numeros");
			
			// log.save(e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
		} catch (Exception e) {
			System.out.println("Contacte al administrador");
		} finally {
			// se escribe lo que necesitamos realizar pase o no pase el error
			System.out.println("Fin del programa");
		}
		System.out.println("................");

	}
}
