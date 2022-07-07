package com.edcuacionit.digitalers.entidades;

public final class Direccion {
	private boolean principal;
	private String calle;
	private Short altura;
	private Byte piso;
	private String numero;

	public Direccion() {
		super();
	}

	public Direccion(boolean principal, String calle, Short altura, Byte piso, String numero) {
		super();
		this.principal = principal;
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion [principal=" + (principal ? "Si" : "No") + ", calle=" + calle + ", altura=" + altura
				+ ", piso=" + piso + ", numero=" + numero + "]";
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Short getAltura() {
		return altura;
	}

	public void setAltura(Short altura) {
		this.altura = altura;
	}

	public Byte getPiso() {
		return piso;
	}

	public void setPiso(Byte piso) {
		this.piso = piso;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

}
