import java.util.Arrays;

public class MetodoMain {
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		String[] meses1 = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
		String[] meses2 = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };

		System.out.println(meses1 == meses2);

		System.out.println(args);
		System.out.println(meses1);

		String cadenaMeses = Arrays.toString(meses1);

		System.out.println(cadenaMeses);
		System.out.println(Arrays.toString(meses1));

		// ordenar

		Arrays.sort(meses1);

		System.out.println(Arrays.toString(meses1));

		int[] notas1 = { 6, 5 };

		int[] notas2 = { 5, 6 };

		System.out.println(notas1 == notas2);

		System.out.println(Arrays.equals(notas1, notas2));

	}
}
