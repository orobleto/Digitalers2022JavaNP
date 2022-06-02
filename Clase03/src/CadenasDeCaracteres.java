
public class CadenasDeCaracteres {
	public static void main(String[] args) {

		String cadena = "Hola Mundo Digitalers";

		System.out.println(cadena.charAt(1));

		cadena = cadena + " 2022";

		System.out.println(cadena);

		// inmutables
		cadena = cadena.concat(" 2023");

		System.out.println(cadena);

		System.out.println(cadena.contains("Octavio"));

		System.out.println(cadena.startsWith("Ho"));

		System.out.println(cadena.endsWith("23"));

		// formatear datos

		int numeroFactura = 5852;

		System.out.println("00000" + numeroFactura);
		// enteros d
		// decimales f
		// cadenas s

		String formato = String.format("%05d", numeroFactura);

		System.out.println(formato);
		String nombre1 = "Enmanuel";
		String nombre2 = "Malena";

		System.out.println("L1 - Hola como estas " + nombre1 + " y " + nombre2 + ", " + nombre2 + " Todo Bien?");

		System.out.println(String.format("L2 - Hola como estas %1$s y %2$s, %2$s todo bien?", nombre1, nombre2));

		float sueldo = 25.369f;

		System.out.println(String.format("  %.2f  (%3$s -  %2$s)    ", sueldo, nombre1, nombre2)); // Numero+$

		cadena = cadena.toLowerCase();

		System.out.println(cadena);

	}
}
