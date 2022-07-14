package com.edcuacionit.digitalers.excepciones;

public class ExcepcionPatron extends Exception {

	private static final long serialVersionUID = 1L;
	private int tipo; // 1 o 2 o 3 o 4

	public ExcepcionPatron(int tipo) {
		this.tipo = tipo;
	}

	public ExcepcionPatron(String message) {
		super(message);
	}

	public String getMessage() {

		switch (tipo) {
		case 1:
			return "El correo electronico no coincide con un patron valido";
		case 2:
			return "La clave debe tener entre 3 y 10 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula";
		}
		return super.getMessage();
	}

}
