
public class Ejercicio03 {
	public static void main(String[] args) {
		// encontrar los primeros 100 numeros pares

		int limite = 1000;
		int contadorPar = 0;

		for (int i = 0; i < limite; i++) {
			// si el indice es par
			if (i % 2 == 0) {
				System.out.println(i);
				contadorPar++;
			}

			if (contadorPar == 100) {
				break;
			}
		}

	}
}
