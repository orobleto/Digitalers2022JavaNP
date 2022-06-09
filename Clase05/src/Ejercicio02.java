
public class Ejercicio02 {
	public static void main(String[] args) {

		for (byte numero = 0; numero < 100; numero++) {
			System.out.println("Iteracion " + numero);
			// impares numero%2!=0
			if (numero % 2 == 1) {
				continue;
			}

			System.out.println("*********************");
			System.out.println("Numero: " + numero);
			System.out.println("*********************");

			if (numero == 50) {
				break;
			}
		}

	}
}
