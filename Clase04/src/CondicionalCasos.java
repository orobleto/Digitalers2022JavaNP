
public class CondicionalCasos {
	public static void main(String[] args) {
		System.out.println("Inicio del Programa Switch");

		int numeroA = 5;
		int numeroB = 6;
		int total = 0;
		char operador = 'g';
		// una sola variable
		switch (operador) {
		case 's':
		case '+':
			total = numeroA + numeroB;
			break;
		case 'r':
		case '-':
			total = numeroA - numeroB;
			break;
		case 'm':
		case '*':
			total = numeroA * numeroB;
			break;
		case 'd':
		case '/':
			if (numeroB!=0) {
				total = numeroA * numeroB;
			}else {
				System.out.println("No se puede dividir por cero");
			}
			break;
		default:
			System.out.println("Ingresaste un operador incorrecto");
		}

		System.out.println("El resultado de " + numeroA + operador + numeroB + " = " + total);

		System.out.println("Fin del Programa");
	}
}
