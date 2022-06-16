
public class MetodosVoidRetorno {
	public static void main(String[] args) {
		algoritmos(3);
	}

	public static void algoritmos(int valor) {
		if (valor == 1) {
			System.out.println(valor);
			return;
		}

		System.out.println("pase por el 1");
		if (valor == 2) {
			System.out.println(valor);
			return;
		}

		System.out.println("pase por el 2");

	}
}
