package com.edcuacionit.digitalers.Clase09;

import javax.swing.JOptionPane;

// no se neceita importat objetos o clases en la misma carpeta o paquete
// no se necesita importar objetos de java.lang
import com.edcuacionit.digitalers.entidades.Alumno;

public class AppListaAlumnosV3 {
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
			alumnos[i] = new Alumno();// asignar o construir un objeto
			alumnos[i].setNombre(JOptionPane.showInputDialog("Ingresa el Nombre:"));
			alumnos[i].setApellido(JOptionPane.showInputDialog("Ingresa el Apellido:"));
			alumnos[i].setEdad(Byte.valueOf(JOptionPane.showInputDialog("Ingresa la Edad:")));
			alumnos[i].setNota(Float.valueOf(JOptionPane.showInputDialog("Ingresa la Nota:")));
			alumnos[i].setActivo(JOptionPane.showConfirmDialog(null, "Esta Activo?") == 0);

		}

		// mostrar alumnos
		for (int i = 0; i < alumnos.length; i++) {

			String mensaje = alumnos[i].getNombre() + " " + alumnos[i].getApellido() + " " + alumnos[i].getEdad() + " "
					+ alumnos[i].getNota() + " " + (alumnos[i].isActivo() ? "esta activo" : "no esta activo");
			JOptionPane.showMessageDialog(null, mensaje);
		}

	}
}
