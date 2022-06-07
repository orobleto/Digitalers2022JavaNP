import java.util.Scanner;

public class EjercicioCalculadora {
	public static void main(String[] args) {
		// declarar variables
		System.out.println("Calculadora Digitalers");
		System.out.println();
		double numero1;
		double numero2;
		char operador;
		double total = 0;
		boolean operacioValida = true;
		String mensaje = "";

		Scanner teclado = new Scanner(System.in);

		// pido los datos al usuario
		System.out.print("Indica el primero numero: ");
		numero1 = teclado.nextInt();

		System.out.print("Indica el segundo numero: ");
		numero2 = teclado.nextInt();

		System.out.print(
				"Indica la operacion a realizar:\n Operadores Validos Suma[+,s], Resta[-,r], Multiplicacion[*,m],Division[/,d]: ");
		operador = teclado.next().charAt(0);
		// cerramos el flujo
		teclado.close();

		if (operador == '+' || operador == 's') {
			total = numero1 + numero2;
		} else if (operador == '-' || operador == 'r') {
			total = numero1 - numero2;
		} else if (operador == '*' || operador == 'm') {
			total = numero1 * numero2;
		} else if (operador == '/' || operador == 'd' ) {
			if (numero2 != 0) {
				total = numero1 / numero2;
			} else {
				operacioValida = false;
				mensaje = "No se puede dividir por cero...";
			}
		} else {
			operacioValida = false;
			mensaje = "Ingresaste un operador invalido";
		}

		if (operacioValida) {
			mensaje = "El resultado de " + numero1 + operador + numero2 + " = " + total;
		}

		System.out.println(mensaje);

		System.out.println("Fin del programa");

	}
}
