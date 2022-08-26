package com.educaciontit.Clase20;

import java.time.LocalDateTime;

import com.educaciontit.entidades.Usuario;
import com.educaciontit.excepciones.JDBCExcepcion;
import com.educaciontit.jdbc.conexiones.AdministradorMariaDB;
import com.educaciontit.jdbc.implementaciones.UsuarioImplementacion;
import com.octaviorobleto.commons.utilities.text.StringUtils;

/**
 * Hello world!
 *
 */

// patrones de diseño https://refactoring.guru/es/
public class App {
	public static void main(String[] args) throws InterruptedException {

		AdministradorMariaDB administradorMariaDB = AdministradorMariaDB.getAdministradorMariaDB();

		UsuarioImplementacion usuarioImplementacion = null;
		try {
			usuarioImplementacion = new UsuarioImplementacion(administradorMariaDB.getConexion());
		} catch (JDBCExcepcion e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 20; i++) {
			Usuario usuario = new Usuario();
			// generacion de usuario y clave random
			String user = "user" + StringUtils.leftPad(("" + (i + 1)), 3, "0");
			String clave = String.valueOf((int) (Math.random() * 10000));

			usuario.setCorreo(user + "@gmail.com");
			usuario.setClave(StringUtils.capitalize(user).concat(".").concat(clave));

			usuario.setActivo(i % 2 == 0);
			usuario.setFechaCreacion(LocalDateTime.now());
			System.out.println("Insertando a --> " + usuario.getCorreo());
			usuarioImplementacion.guardar(usuario);
			Thread.sleep(1000);
		}
		System.out.println("************ usuarios **************");

		for (Usuario usuario : usuarioImplementacion.listar()) {
			System.out.println(usuario);
		}

	}
}
