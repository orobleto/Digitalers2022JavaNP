import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		String usuarioBaseDeDatos = "admin@digitalers.com.ar";
		String claveBaseDeDatos = "Admin.1234";
		String usuario, clave;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el usuario: ");
		usuario = teclado.next();

		System.out.print("Introduce la clave: ");
		clave = teclado.next();

		if (usuarioBaseDeDatos.equalsIgnoreCase(usuario) && claveBaseDeDatos.equals(clave)) {
			System.out.println("Bienvenido al sistema");
		} else {
			System.out.println("Credenciales incorrectas");
		}

	}
}
