import javax.swing.JOptionPane;

public class Metodos {
	public static void main(String[] args) {
		// argumentos
		sumar(5, 6);

		float alfa = 5.3f;
		int beta = 8;
		restar(alfa, beta);

		double totalMultiplicar = multiplicar(5.3, 8.0);

		System.out.println("El valor retornado fue: " + totalMultiplicar);

	}

	// metodos o funciones

	// modificador de acceso = public
	// miembro = static
	// tipo de retorno = void y por ahora los datos que conocemos datosPrimitivos y
	// objetos conocidos
	// identificador
	// parametros encerrados entre parentesis

	// parametros tipo y el nombre
	public static void sumar(int a, int b) {
		JOptionPane.showMessageDialog(null, "El resultado de " + a + " + " + b + ": " + (a + b));
	}

	public static void saludo() {
		JOptionPane.showMessageDialog(null, "Hola");
	}

	public static void restar(float a, int b) {
		JOptionPane.showMessageDialog(null, "El resultado de " + a + " - " + b + ": " + (a - b));
	}

	public static double multiplicar(double a, double b) {
		double total = a * b;
		System.out.println(total);
		return total;
	}

}
