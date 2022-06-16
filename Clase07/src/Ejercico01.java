
public class Ejercico01 {
	public static void main(String[] args) {
		double[] notas = { 2.6, 5.6, 9, 8.3 };

		System.out.println("La nota mayor es: " + valorMayor(notas));

		System.out.println("La nota menor es: " + valorMenor(notas));

		double[] extremos = valoresExtremosR(notas);

		System.out.println("La nota menor es: " + extremos[0] + ", La nota mayor es: " + extremos[1]);

	}

	public static double valorMayor(double[] valores) {
		double mayor = valores[0];
		for (int i = 0; i < valores.length; i++) {
			if (mayor < valores[i]) {
				mayor = valores[i];
			}
		}
		return mayor;
	}

	public static double valorMenor(double[] valores) {
		double menor = valores[0];
		for (int i = 0; i < valores.length; i++) {
			if (menor > valores[i]) {
				menor = valores[i];
			}
		}
		return menor;
	}

	public static double[] valoresExtremos(double[] valores) {
		double menor = valores[0];
		double mayor = valores[0];

		for (int i = 0; i < valores.length; i++) {
			if (mayor < valores[i]) {
				mayor = valores[i];
			}

			if (menor > valores[i]) {
				menor = valores[i];
			}
		}

		double[] extremos = { menor, mayor };
		return extremos;
	}

	public static double[] valoresExtremosR(double[] valores) {
		double[] extremos = { valorMenor(valores), valorMayor(valores) };
		return extremos;
	}
}
