
public class Ejercicio1 {
	public static void main(String[] args) {
		int numero1 = 5;
		int numero2 = 6;
		int total = 0;

		boolean sonIguales = numero1 == numero2;
		boolean totalIgual6 = (total = numero1 + numero2) == 6;

		System.out.println(numero1 == numero2 & (total = numero1 + numero2) == 6);

		System.out.println(sonIguales & totalIgual6);

	}
}
