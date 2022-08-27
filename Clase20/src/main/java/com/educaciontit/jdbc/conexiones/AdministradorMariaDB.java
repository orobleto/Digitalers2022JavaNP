package com.educaciontit.jdbc.conexiones;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
			administradorMariaDB = new AdministradorMariaDB();
		}

		return administradorMariaDB;
	}

	public Connection getConexion() {
		return conexion;
	}

	private void setConexion() {
		Properties propiedades = new Properties();
		try {
			propiedades.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("basededatos.properties"));
			//toda la ruta "C:\\Users\\Boreal\\Documents\\Educacion IT\\Digitalers 2022\\Clase20\\src\\main\\resources\\basededatos.properties"
			//ruta relativa "src\\main\\resources\\basededatos.properties"
			//ruta del recurso Thread.currentThread().getContextClassLoader().getResourceAsStream("basededatos.properties")
		} catch (IOException e) {
			e.printStackTrace();
		}
		String url = propiedades.getProperty("db.url");
		String usuario = propiedades.getProperty("db.usuario", "root");
		String clave = propiedades.getProperty("db.clave");
		String driver = propiedades.getProperty("driver");

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
