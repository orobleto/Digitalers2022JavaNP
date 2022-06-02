import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	public static void main(String[] args) {
		// declaro variables
		String nombre;
		byte edad;
		double sueldo;
		Scanner consola = new Scanner(System.in);

		// pido los datos al cliente

		System.out.print("Indique su nombre: ");
		nombre = consola.nextLine();

		System.out.print("Indica tu edad: ");
		edad = consola.nextByte();

		System.out.print("Indique el sueldo: ");
		sueldo = consola.nextFloat();

		consola.close();

		System.out.printf("Su nombre es %s, tiene %d años de edad, el sueldo de %1$s es %.4f", nombre, edad, sueldo);

		String cadena = String.format("Su nombre es %s, tiene %d años de edad, el sueldo de %1$s es %.4f", nombre, edad,
				sueldo);
		
		JOptionPane.showMessageDialog(null, cadena);
		// algoritmos

		// algoritmos

	}
}
