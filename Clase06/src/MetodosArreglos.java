import java.util.Arrays;

import javax.swing.JOptionPane;

public class MetodosArreglos {
	public static void main(String[] args) {

		/*
		 * String nombre1 = JOptionPane.showInputDialog("Dame tu nombre"); String
		 * nombre2 = JOptionPane.showInputDialog("Dame tu nombre");
		 * 
		 * System.out.println(nombre1.equals(nombre2));
		 */

		String[] cursos1 = { "Java" };
		String[] cursos2 = { "Java", "Python", "CSS" };

		System.out.println(Arrays.equals(cursos1, cursos2));

		System.out.println(Arrays.toString(cursos2));

		Arrays.sort(cursos2);
		System.out.println(Arrays.toString(cursos2));

		String[] cursosNocturnos = Arrays.copyOf(cursos2, 6);

		System.out.println(Arrays.toString(cursosNocturnos));

		String[] cursosDiurno = Arrays.copyOfRange(cursos2, 1, 4);

		System.out.println(Arrays.toString(cursosDiurno));
	}
}
