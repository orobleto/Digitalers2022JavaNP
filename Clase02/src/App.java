
public class App {
	public static void main(String[] arg) {
		// es de tipado fuerte
		short edad = 39;
		String mensaje = "Tiene " + edad;
		System.out.println(mensaje);
		System.out.println("Tiene " + edad);

		double numero1 = 5;
		double numero2 = 6;

		System.out.println("Numero 1 = " + numero1);
		System.out.println("Numero 2 = " + numero2);

		System.out.println("1 La suma es: " + (numero1 + numero2));

		double totalSuma = numero1 + numero2;

		System.out.println("2 La suma es: " + totalSuma);

		double totalDivision = numero1 / numero2;

		System.out.println("La division es: " + totalDivision);

		System.out.println(48 % 12);

	}
}
