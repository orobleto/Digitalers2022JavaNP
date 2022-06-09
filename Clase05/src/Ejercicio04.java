
public class Ejercicio04 {
	public static void main(String[] args) {
		// encontrar los primeros 100 numeros pares

		int limite = 1000;

		for (int i = 0, contadorPar = 0; i < limite && contadorPar < 100; i++) {

			// si el indice es par
			if (i % 2 == 0) {
				contadorPar++;
				System.out.println("Cantidad de Pares: " + contadorPar + ", Numero Par-->" + i);

			}

		}
	}
}
