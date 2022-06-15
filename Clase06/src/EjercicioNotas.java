import java.util.Arrays;

import javax.swing.JOptionPane;

public class EjercicioNotas {

	public static void main(String[] args) {

		// aca pedimos la cantidad de notas y la parseamos a un entero
		int cantidad = Integer.valueOf(JOptionPane.showInputDialog(null, "Cuantas notas vas a ingresar?"));
		float[] notas = new float[cantidad];

		// lleno el arreglo
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Float.valueOf(JOptionPane.showInputDialog("Ingresa la nota [" + (i + 1) + "]:"));
		}

		float notaMayor = notas[0];
		float notaMenor = notas[0];

		// indicar cual es el dato menor o mayor
		for (int i = 0; i < notas.length; i++) {

			if (i == 0) {
				continue;
			}

			if (notaMayor < notas[i]) {
				notaMayor = notas[i];
			}

			if (notaMenor > notas[i]) {
				notaMenor = notas[i];
			}

		}
		String mensaje = Arrays.toString(notas) + "\nLa nota mayor es: " + notaMayor + "\nLa nota menor es :"
				+ notaMenor;

		JOptionPane.showMessageDialog(null, mensaje);

	}

}
