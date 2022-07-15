package com.edcuacionit.digitalers.Clase14;

import com.edcuacionit.digitalers.entidades.Usuario;
import com.edcuacionit.digitalers.enumerados.TipoUsuario;
import com.edcuacionit.digitalers.excepciones.ExcepcionPatron;

public class AppEnumerados {
	public static void main(String[] args) throws ExcepcionPatron {
		Usuario usuario = new Usuario();
		String correo = "Octavio@gmail.com";
		usuario.setCorreo(correo);
		String tipo = "usuario final  ";// JOptionPane.showInputDialog("Indica el Tipo de usuario:");
		tipo = tipo.trim().replace(" ", "_").toUpperCase();
		System.out.println(tipo);
		TipoUsuario tipoUsuario = TipoUsuario.valueOf(tipo);
		usuario.setTipo(tipoUsuario);
		System.out.println(usuario);
		tipoUsuario = TipoUsuario.valueOf("ADMINISTRADOR");
		usuario.setTipo(tipoUsuario);
		System.out.println(usuario);

		TipoUsuario[] tipos = TipoUsuario.values();
		System.out.println("Puedes seleccionar entre: ");
		for (TipoUsuario usuarioTipo : tipos) {
			System.out.println(usuarioTipo.getCadena());
		}

		switch (tipoUsuario) {
		case ADMINISTRADOR:
			System.out.println("Es administrador posee todos los permisos");
		case SUPERVISOR:
			System.out.println("Es supervisor tiene facultades limitadas");
			break;
		case USUARIO_FINAL:
			System.out.println("Es Usuario Usted solo puede consultar");
			break;
		default:
			break;
		}

		System.out.println(usuario.getCorreoToUpperCase());
		System.out.println(usuario.getCorreo());
		usuario.setCorreo(usuario.getCorreoToUpperCase());

	}
}
