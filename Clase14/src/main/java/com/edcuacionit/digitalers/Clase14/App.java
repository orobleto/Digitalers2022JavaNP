package com.edcuacionit.digitalers.Clase14;

import static com.edcuacionit.digitalers.enumerados.TipoUsuario.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.edcuacionit.digitalers.entidades.Usuario;
import com.edcuacionit.digitalers.excepciones.ExcepcionFecha;
import com.edcuacionit.digitalers.excepciones.ExcepcionPatron;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		try {
			usuario.setCorreo("octavio.robleto@gmail.com");
			usuario.setClave("Ab1234567");
			usuario.setFechaCreacion(LocalDate.now().minusMonths(2));
			usuario.setFechaUltimoAcceso(LocalDateTime.now());
			usuario.setTipo(ADMINISTRADOR);// CUIT
			System.out.println(usuario);
		} catch (ExcepcionPatron | ExcepcionFecha e) {
			// comportamiento distinto al excepcion padre
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fin de la aplicacion");
	}
}
