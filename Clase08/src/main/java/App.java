import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Alumno alumno1 = new Alumno(); // new Objeto

		// declarando el objeto
		Alumno alumno2;

		alumno2 = new Alumno();

		alumno1.nombre = "Octavio";
		alumno1.apellido = "Robleto";
		alumno1.edad = 39;
		alumno1.activo = true;

		alumno2.nombre = "Sol";
		alumno2.apellido = "Fanton";
		alumno2.edad = 18;
		alumno2.cambiarEstado(true);

		alumno1.mostrarDatos();
		alumno2.mostrarDatos();

		System.out.println(alumno1.anioNacimiento());
		System.out.println(alumno2.anioNacimiento());

		Calculos calculo = new Calculos();

		Alumno alumno3 = new Alumno("Rafael");
		alumno3.mostrarDatos();

		Alumno alumno4 = new Alumno("Matias", "Acevedo", (byte) 20, true);

		Scanner teclado = new Scanner(System.in);

		Profesor profesor1 = new Profesor("Octavio Robleto", (byte) 39, true);
		
		System.out.println(profesor1.mostrarDatos());
		
		profesor1.descripcion ="Octavio I. Robleto";
		
		System.out.println(profesor1.mostrarDatos());
		
		

	}
}
