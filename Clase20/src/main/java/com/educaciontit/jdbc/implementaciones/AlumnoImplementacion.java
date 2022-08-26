package com.educaciontit.jdbc.implementaciones;

import java.sql.Connection;
import java.util.List;

import com.educaciontit.entidades.Alumno;
import com.educaciontit.entidades.Documento;
import com.educaciontit.excepciones.JDBCExcepcion;

public class AlumnoImplementacion extends ImplementacionGenerica<Alumno, Documento> {

	public AlumnoImplementacion(Connection conexion) throws JDBCExcepcion {
		super(conexion);
	}

	public Alumno buscarPorClavePrimaria(Documento documento) {
		return null;
	}

	public boolean guardar(Alumno alumno) {
		return false;
	}

	public boolean eliminar(Alumno alumno) {
		return false;
	}

	public List<Alumno> listar() {
		return null;
	}

	protected boolean insertar(Alumno alumno) {
		return false;
	}

	protected boolean modificar(Alumno alumno) {
		return false;
	}

}
