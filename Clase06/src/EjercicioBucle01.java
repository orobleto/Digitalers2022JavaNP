import javax.swing.JOptionPane;

public class EjercicioBucle01 {
	public static void main(String[] args) {
		// adivinar un numero

		String[] niveles = { "Basico", "Intermedio", "Avanzado" };
		String mensajeInicial = "Indica un numero:";

		String nivelUsuario = (String) JOptionPane.showInputDialog(null, "Seleccione un nivel", "Advina el Numero", 0,
				null, niveles, 0);

		int nivel;

		switch (nivelUsuario) {
		case "Basico":
			nivel = 10;
			break;
		case "Intermedio":
			nivel = 100;
			break;
		default:
			nivel = 1000;
		}

		int numeroAleatorio = (int) (Math.random() * nivel);
		System.out.println(numeroAleatorio);
		do {

			int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog(mensajeInicial));

			if (numeroUsuario == numeroAleatorio) {
				JOptionPane.showMessageDialog(null, "Felicitaciones adivinaste, el numero es " + numeroAleatorio);
				break;
			} else if (numeroUsuario < numeroAleatorio) {
				mensajeInicial = "Intenta un numero Mayor:";
			} else {
				mensajeInicial = "Intenta un numero Menor:";
			}

			int seguir = JOptionPane.showConfirmDialog(null, "Desea Continuar");
			if (seguir != 0) {
				break;
			}

		} while (true);

	}
}
