
public class CondicionalIfElse {

	public static void main(String[] args) {
		System.out.println("Inicio del Programa");

		int numeroA = 5;
		int numeroB = 6;
		int total = 0;
		char operador = '+';

		if (operador == '+') {
			total = numeroA + numeroB;
		} else {
			total = numeroA - numeroB;
		}

		System.out.println("El resultado de " + numeroA + operador + numeroB + " = " + total);
		System.out.println("Fin del Programa");

	}

}
