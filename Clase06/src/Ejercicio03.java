
public class Ejercicio03 {
	public static void main(String[] args) {
		// pedir al usuario un precio 1
		// pedir al usuario precio final
		// indicar en cuantos meses el precio 1 llega al precio 2 segun una inflacion
		// del 5% mensual
		double precioInicial = 0;
		double precioFinal = 0;
		do {
			System.out.println("Indica Precio Inicial:");

			System.out.println("Indica Precio Final");

			if (precioInicial < precioFinal) {
				break;
			}
			System.out.println("El precio Inicial debe ser menor al Precio Final");
		} while (true);

		double porcentaje = (5 / 100) + 1;

		double precioAux = precioInicial;
		
		precioAux *= porcentaje;

	}
}
