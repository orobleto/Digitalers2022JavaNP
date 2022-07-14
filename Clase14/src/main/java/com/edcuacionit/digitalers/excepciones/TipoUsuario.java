package com.edcuacionit.digitalers.excepciones;

public enum TipoUsuario {

	ADMINISTRADOR("Administrador", 0), USUARIO_FINAL("Usuario Final", 2), SUPERVISOR("Supervisor", 1);

	private int nivel;
	private String cadena;

	private TipoUsuario(String cadena, int nivel) {
		this.cadena = cadena;
		this.nivel = nivel;
	}

	// retornar el nivel asociado
	public int getNivel() {
		return nivel;
	}

	public String getCadena() {
		return cadena;
	}
}
