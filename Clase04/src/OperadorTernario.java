import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		// declaro variables
		byte edad = 20;

		// evalua si una persona es mayor de edad o no y lo muestra

		if (edad >= 18) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona es menor de edad");
		}

		if (edad >= 18)
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");

		// las preguntas ? valoreTrue : valorFalse

		System.out.println(edad >= 18 ? "Mayor" : "Menor");
		boolean esMayor;
		if (edad >= 18) {
			esMayor = true;
		} else {
			esMayor = false;
		}

		esMayor = edad >= 18;

		String mensaje = edad >= 18 ? "Es una persona mayor" : "Es una persona menor";

	}
}
