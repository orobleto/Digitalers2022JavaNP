package com.edcuacionit.digitalers.entidades;

import static com.edcuacionit.digitalers.utils.utilities.text.StringUtils.isKey;
import static com.edcuacionit.digitalers.utils.utilities.text.StringUtils.isMail;

import java.io.Closeable;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.edcuacionit.digitalers.enumerados.TipoUsuario;
import com.edcuacionit.digitalers.excepciones.ExcepcionFecha;
import com.edcuacionit.digitalers.excepciones.ExcepcionPatron;
import com.edcuacionit.digitalers.utils.utilities.time.DateUtils;

//
public class Usuario implements Closeable {

	private String correo;
	private String clave;
	private LocalDate fechaCreacion; // yyyy-mm-dd
	private LocalDateTime fechaUltimoAcceso; // yyyy-mm-dd hh:mm:ss
	private TipoUsuario tipo;

	public Usuario() {
		super();
		System.out.println("Instancia: " + LocalDateTime.now());
	}

	public Usuario(String correo, String clave, LocalDate fechaCreacion, LocalDateTime fechaUltimoAcceso)
			throws ExcepcionPatron {
		super();
		setCorreo(correo);
		setClave(clave);
		setFechaCreacion(fechaCreacion);
		setFechaUltimoAcceso(fechaUltimoAcceso);
		System.out.println("Instancia: " + LocalDateTime.now());
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", fechaCreacion="
				+ DateUtils.getString(fechaCreacion, "dd/MM/yyyy") + ", fechaUltimoAcceso="
				+ DateUtils.getString(fechaUltimoAcceso, "dd/MM/yyyy KK:mm:ss a") + ",\ntipo=" + tipo.getCadena()
				+ ", nivel=" + tipo.getNivel() + ", orden=" + tipo.ordinal() + "]";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) throws ExcepcionPatron {
		if (!isMail(correo)) { // !NO
			throw new ExcepcionPatron(1);
		}
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) throws ExcepcionPatron {
		if (!isKey(clave)) {
			throw new ExcepcionPatron(2);
		}
		this.clave = clave;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		if (LocalDate.now().isBefore(fechaCreacion)) {
			throw new ExcepcionFecha("La fecha no debe ser mayor a la actual");
		}

		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaUltimoAcceso() {
		return fechaUltimoAcceso;
	}

	public void setFechaUltimoAcceso(LocalDateTime fechaUltimoAcceso) {
		if (LocalDateTime.now().isBefore(fechaUltimoAcceso)) {
			throw new ExcepcionFecha("La fecha no debe ser mayor a la actual");
		}
		this.fechaUltimoAcceso = fechaUltimoAcceso;
	}

	@Override
	public void close() throws IOException {
		System.out.println("Cierre: " + LocalDateTime.now());

	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public String getCorreoToUpperCase() {
		return correo.toUpperCase();
	}

}
