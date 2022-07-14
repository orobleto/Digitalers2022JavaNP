package com.edcuacionit.digitalers.Clase14;

import com.edcuacionit.digitalers.entidades.Usuario;

public final class AppPracticaClosable {
	public static void main(String[] args) {

		try (Usuario usuario = new Usuario()) {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
