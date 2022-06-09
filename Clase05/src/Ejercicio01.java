
public class Ejercicio01 {

	public static void main(String[] args) {
		// generar un numero aleatorio
		double numeroAleatorio;
		// local
		do {
			numeroAleatorio = Math.random();
			System.out.println("El numero Generado es: " + numeroAleatorio);
			//lee la linea

		} while (numeroAleatorio < 0.9);

	}
}
