import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String prefijo;
		String facturaFinal;
		int numeroFactura;
		int longitudPrefijo;

		System.out.print("Introduce el prefijo de la factura: ");
		prefijo = teclado.next();

		numeroFactura = (int) (Math.random() * 10000);
		longitudPrefijo = prefijo.length();

		facturaFinal = prefijo.toUpperCase()
				+ String.format("%" + (20 - longitudPrefijo) + "s", numeroFactura).replace(" ", "#");

		// ABC##############276
		// HB##############8807
		// LHLHLDDD#########615

		// 10 0 a 1 0.5 5

		System.out.println(facturaFinal);

	}
}
