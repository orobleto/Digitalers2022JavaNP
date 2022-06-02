import java.util.Scanner;

public class LeerConsola {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe una letra:");
		
		char caracter = teclado.next().charAt(0);
		
		teclado.nextLine();		
		
		System.out.println("Escribe una cadena:");
		String cadena = teclado.nextLine();
		
		
		System.out.println("Escribiste: " + caracter + " - " + cadena);
		
		

	}
}
