
public class Meses {
	public static void main(String[] args) {
		int edad;

		String[] meses = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
		System.out.println(meses.length);

		// System.out.println(meses[meses.length - 1]);

		for (int i = 0; i < meses.length; i++) {
			System.out.println("meses[" + i + "]:" + meses[i]);
		}

		String[] notas = new String[10];
		// boolean false
		// char ' '
		// numeros 0
		// String

		// null

		String nombre = null;

		System.out.println("Nombre:::::::" + nombre);
		System.out.println("Nombre:::::::" + nombre.toLowerCase());

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);

		}

	}
}
