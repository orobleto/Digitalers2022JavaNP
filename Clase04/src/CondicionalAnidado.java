
/**
 * @since 
 * @author Boreal
 * @see Clase03
 *
 */
public class CondicionalAnidado {
	public static void main(String[] args) {
		System.out.println("Inicio del Programa");

		int numeroA = 5;
		int numeroB = 6;
		int total = 0;
		char operador = 'P';

		/*
		 * para este caso no se debe hacer asi if (operador == '+') { total = numeroA +
		 * numeroB; } else { if (operador == '-') { total = numeroA - numeroB; } else {
		 * System.out.println(operador + " No es un operador valido"); } }
		 */
		
		// el operador y los numeros se los tienen  que pedir al usuario 
		// ingresar datos por scanner
		
		// la suma debe realizarse si el usuario ingresa + , s , multiplicacion * , m , resta - , r, division / , d

		if (operador == '+') {
			total = numeroA + numeroB;
		} else if (operador == '-') {
			total = numeroA - numeroB;
		} else if (operador == '*') {
			total = numeroA * numeroB;
		} else if (operador == '/') {
			total = numeroA / numeroB;
		} else {
			System.out.println(operador + " No es un operador valido");
		}
		

		System.out.println("El resultado de " + numeroA + operador + numeroB + " = " + total);

		System.out.println("Fin del Programa");
		
		
		

	}
}
