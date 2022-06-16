import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {

		char operacion = JOptionPane.showInputDialog("Indica la operacion [ + , - , * , / ]:").charAt(0);
		double a = Double.parseDouble(JOptionPane.showInputDialog("Indica el primer valor:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Indica el segundo valor:"));

		operar(operacion, a, b);

	}

	public static void operar(char operacion, double a, double b) {
		double total = 0;
		boolean operacionValida = true;
		switch (operacion) {
		case '+':
			total = suma(a, b);
			break;
		case '-':
			total = restar(a, b);
			break;
		case '*':
			total = multiplicar(a, b);
			break;
		case '/':
			total = dividir(a, b);
			break;
		default:
			operacionValida = false;
		}
		if (operacionValida) {
			JOptionPane.showMessageDialog(null, a + " " + operacion + " " + b + " = " + total);
		} else {
			JOptionPane.showMessageDialog(null, "El operador utilizado no es correcto " + operacion);
		}

	}

	public static double suma(double a, double b) {
		return a + b;
	}

	public static double restar(double a, double b) {
		return a - b;
	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}

	public static double dividir(double a, double b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
	

}
