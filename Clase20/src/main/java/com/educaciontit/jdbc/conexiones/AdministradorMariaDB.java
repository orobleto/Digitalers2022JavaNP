package com.educaciontit.jdbc.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorMariaDB {

	private Connection conexion;
	// miembro de clase
	private static AdministradorMariaDB administradorMariaDB;

	private AdministradorMariaDB() {
		super();
		setConexion();
	}

	public static AdministradorMariaDB getAdministradorMariaDB() {

		if (administradorMariaDB == null) {
			System.out.println("Estoy en null por instanciar la primera vez");
			administradorMariaDB = new AdministradorMariaDB();
		}

		System.out.println(administradorMariaDB);
		return administradorMariaDB;
	}

	public Connection getConexion() {
		return conexion;
	}

	private void setConexion() {
		String url = "jdbc:mariadb://localhost:3306/digitalers2022";
		String usuario = "root";
		String clave = "";
		String driver = "org.mariadb.jdbc.Driver";

		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, usuario, clave);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
