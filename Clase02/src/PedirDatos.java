
import java.util.Scanner;

public class PedirDatos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int edad;

		System.out.println("Escribe tu edad:");
		edad = teclado.nextInt();

		System.out.println("Tu edad es " + edad);

		System.out.println("Eres mayor de edad?");
		boolean mayorEdad = teclado.nextBoolean();
		System.out.println(mayorEdad);

		System.out.println("Escribe tu nombre:");
		// escape
		teclado.nextLine();
		String nombre = teclado.nextLine();
		System.out.println("Tu nombre es " + nombre);

	}
}