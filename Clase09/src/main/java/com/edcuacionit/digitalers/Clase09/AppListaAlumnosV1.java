package com.edcuacionit.digitalers.Clase09;

import javax.swing.JOptionPane;

// no se neceita importat objetos o clases en la misma carpeta o paquete
// no se necesita importar objetos de java.lang
import com.edcuacionit.digitalers.entidades.Alumno;

public class AppListaAlumnosV1 {
	public static void main(String[] args) {
		// encapsulamiento, herencia, abstraccion pero no el polimorfismo

		// arreglo de alumnos y pedir sus datos

		Alumno[] alumnos;
		// Ventanas

		int cantidadAlumnos = Integer.valueOf(JOptionPane.showInputDialog("Cuantos alumnos va a ingresar:"));

		// asigno o doy tamaño al arreglo de alumnos
		alumnos = new Alumno[cantidadAlumnos];

		// pedir alumnos
		for (int i = 0; i < alumnos.length; i++) {
			String nombre = JOptionPane.showInputDialog("Ingresa el Nombre:");
			String apellido = JOptionPane.showInputDialog("Ingresa el Apellido:");
			byte edad = Byte.valueOf(JOptionPane.showInputDialog("Ingresa la Edad:"));
			float nota = Float.valueOf(JOptionPane.showInputDialog("Ingresa la Nota:"));
			boolean activo = JOptionPane.showConfirmDialog(null, "Esta Activo?") == 0;

			Alumno alumno = new Alumno(nombre, apellido, edad, nota, activo);
			alumnos[i] = alumno;
		}

		// mostrar alumnos
		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumno = alumnos[i];

			String mensaje = alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getEdad() + " "
					+ alumno.getNota() + " " + (alumno.isActivo() ? "esta activo" : "no esta activo");
			JOptionPane.showMessageDialog(null, mensaje);
		}

	}
}
