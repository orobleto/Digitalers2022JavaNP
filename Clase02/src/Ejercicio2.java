import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		String nombre;
		byte edad;

		System.out.println("Dime tu edad:");
		edad = consola.nextByte();
		System.out.println("Tu edad es: " + edad);
		consola.nextLine();

		System.out.println("Dime tu nombre:");
		nombre = consola.next();

		System.out.println("Tu nombre es: " + nombre);

		System.out.println("Indica tu sueldo: ");
		double sueldo = consola.nextDouble();

		System.out.println("Dime tu inicial");
		char inicial = consola.next().charAt(0);

		System.out.println("Tu inicial es: " + inicial);

	}
}
