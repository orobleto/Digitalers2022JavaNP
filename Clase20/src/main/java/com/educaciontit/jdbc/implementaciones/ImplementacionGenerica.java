package com.educaciontit.jdbc.implementaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.educaciontit.excepciones.JDBCExcepcion;
import com.educaciontit.jdbc.DAO;

public abstract class ImplementacionGenerica<E, K> implements DAO<E, K> {
	protected PreparedStatement preparedStatementBuscarPorClavePrimaria;
	protected PreparedStatement preparedStatementInsertar;
	protected PreparedStatement preparedStatementEliminar;
	protected PreparedStatement preparedStatementActualizar;
	protected PreparedStatement preparedStatementListar;
	protected Connection conexion;

	public ImplementacionGenerica(Connection conexion) throws JDBCExcepcion {
		if (conexion == null) {
			throw new JDBCExcepcion("No puedes implementar sin una conexion");
		}
		this.conexion = conexion;
	}

	protected abstract boolean insertar(E e);

	protected abstract boolean modificar(E e);

}
