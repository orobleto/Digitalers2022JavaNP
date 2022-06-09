
public class Ejercicio06 {
	public static void main(String[] args) {
		// dado los numero del 0 un limite indique cuales son numeros primos

		// 1 y el mismo , 0 , 1, 2, 3, 5, 7, 11
		int limite = 100000;
		int contador = 0; // 3
		// 6
		for (int i = 1; i <= limite; i++) {

			boolean esPrimo = true;
			// 6 2
			contador++;
			// 704.982.705 j < i sin break
			// 455.289.150 j < i con break
			// 2.845.694 j <=(Math.sqrt(i)) con break
			for (int j = 2; j <= (Math.sqrt(i)); j++) {
				contador++;
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				System.out.println(i);
			}

		}

		System.out.println(contador);
	}
}
