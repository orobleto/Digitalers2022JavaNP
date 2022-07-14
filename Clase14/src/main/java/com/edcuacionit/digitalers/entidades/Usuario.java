package com.edcuacionit.digitalers.entidades;

import java.io.Closeable;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.edcuacionit.digitalers.excepciones.ExcepcionFecha;
import com.edcuacionit.digitalers.excepciones.ExcepcionPatron;
import com.edcuacionit.digitalers.utils.utilities.text.StringUtils;
import com.edcuacionit.digitalers.utils.utilities.time.DateUtils;

//
public class Usuario implements Closeable {
	private String correo;
	private String clave;
	private LocalDate fechaCreacion; // yyyy-mm-dd
	private LocalDateTime fechaUltimoAcceso; // yyyy-mm-dd hh:mm:ss

	public Usuario() {
		super();
		System.out.println("Instancia: " + LocalDateTime.now());
	}

	public Usuario(String correo, String clave, LocalDate fechaCreacion, LocalDateTime fechaUltimoAcceso)
			throws ExcepcionPatron {
		super();
		setCorreo(correo);
		setClave(clave);
		setfechaCreacion(fechaCreacion);
		setFechaUltimoAcceso(fechaUltimoAcceso);
		System.out.println("Instancia: " + LocalDateTime.now());
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", fechaCreacion="
				+ DateUtils.getString(fechaCreacion, "dd/MM/yyyy") + ", fechaUltimoAcceso="
				+ DateUtils.getString(fechaUltimoAcceso, "dd/MM/yyyy KK:mm:ss a") + "]";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) throws ExcepcionPatron {
		if (!StringUtils.isMail(correo)) { // !NO
			throw new ExcepcionPatron(1);
		}
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) throws ExcepcionPatron {
		if (!StringUtils.isKey(clave)) {
			throw new ExcepcionPatron(2);
		}
		this.clave = clave;
	}

	public LocalDate getfechaCreacion() {
		return fechaCreacion;
	}

	public void setfechaCreacion(LocalDate fechaCreacion) {
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

}
