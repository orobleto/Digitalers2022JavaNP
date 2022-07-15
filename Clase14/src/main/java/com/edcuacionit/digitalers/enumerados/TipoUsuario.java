package com.edcuacionit.digitalers.enumerados;
// ni heredables ni heredan de otras clases

public enum TipoUsuario {
// constantes static y finales
	ADMINISTRADOR("Administrador", 0), 
	USUARIO_FINAL("Usuario Final", 2), 
	SUPERVISOR("Supervisor", 1);

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
