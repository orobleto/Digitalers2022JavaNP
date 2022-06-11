import java.util.Scanner;

public class IgualdadEnCadenasDeTexto {
	public static void main(String[] args) {
		// String Objeto

		// datos primitivos byte, short, int, long, float, double ,boolean y char

		Scanner teclado = new Scanner(System.in);
		int numA, numB;
		String cadenaA, cadenaB;

		// pedir datos numericos
		System.out.print("Ingresa un numero A: ");
		numA = teclado.nextInt();
		System.out.print("Ingresa un numero B: ");
		numB = teclado.nextInt();

		// pedir cadenas
		System.out.print("Ingresa una cadana A: ");
		cadenaA = teclado.next();

		System.out.print("Ingresa una cadana B: ");
		cadenaB = teclado.next();

		System.out.println(numA + " = " + numB + "? " + (numA == numB ? "Si" : "No"));
		System.out.println(cadenaA + " = " + cadenaB + "? " + (cadenaA == cadenaB ? "Si" : "No"));
		System.out.println((cadenaA + " equals " + cadenaB + "? " + (cadenaA.equals(cadenaB) ? "Si" : "No")));
		System.out.println((cadenaA + " equalsIgnoreCase " + cadenaB + "? " + (cadenaA.equalsIgnoreCase(cadenaB) ? "Si" : "No")));
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
