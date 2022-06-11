import java.util.Iterator;

public class Arreglos {
	public static void main(String[] args) {

		int[] edades1;
		int edades2[];

		// "Constante"
		String[] meses = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic", "Pol" };// 1,2

		double[] notas;
		notas = new double[5];// numero entero con la longitud del arreglo

		// double[] notas = new double[4];

		int edad;

		edad = 35;

		notas[0] = 5.36;
		notas[1] = 8;
		notas[2] = 9;
		notas[3] = 10;
		notas[4] = 8.96;

		System.out.println(edad);
		System.out.println(notas[0]);
		System.out.println("Notas --> " + notas);
		for (int i = 0; i < notas.length; i++) {
			"".length();
			System.out.println(notas[i]);
		}

		for (int i = 0; i <= meses.length; i++) {
			System.out.println(meses[i]);
		}

	}
}
