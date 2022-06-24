package com.edcuacionit.digitalers.Clase09;

import javax.swing.JOptionPane;

// no se neceita importat objetos o clases en la misma carpeta o paquete
// no se necesita importar objetos de java.lang
import com.edcuacionit.digitalers.entidades.Alumno;

public class AppListaAlumnosV2 {
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
			Alumno alumno = new Alumno();
			alumno.setNombre(JOptionPane.showInputDialog("Ingresa el Nombre:"));
			alumno.setApellido(JOptionPane.showInputDialog("Ingresa el Apellido:"));
			alumno.setEdad(Byte.valueOf(JOptionPane.showInputDialog("Ingresa la Edad:")));
			alumno.setNota(Float.valueOf(JOptionPane.showInputDialog("Ingresa la Nota:")));
			alumno.setActivo(JOptionPane.showConfirmDialog(null, "Esta Activo?") == 0);

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
