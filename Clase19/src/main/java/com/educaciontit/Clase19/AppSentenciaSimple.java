package com.educaciontit.Clase19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import com.octaviorobleto.commons.utilities.text.StringUtils;
import com.octaviorobleto.commons.utilities.time.DateUtils;

/**
 * Hello world!
 *
 */
public class AppSentenciaSimple {
	public static void main(String[] args) throws InterruptedException {

		// jdbc:motor://servidor:puerto/base_de_datos
		String url = "jdbc:mariadb://localhost:3306/digitalers_base_prueba";
		String usuario = "root";
		String clave = "";
		String driver = "org.mariadb.jdbc.Driver";

		// Reflexion
		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, usuario, clave);
			System.out.println("se realizo la conexion de forma exitosa");

			Statement sentencia = conexion.createStatement();
			// execute
			// executequery

			for (int i = 0; i < 40; i++) {
				String insertar = "insert into prueba(descripcion,fecha,activo,valor) " + "values ('Alumno "
						+ StringUtils.leftPad(("" + (i + 1)), 2, "0") + "' ,'" + LocalDateTime.now() + "'," + (i % 2)
						+ "," + (5.63 * i) + ")";
				System.out.println(insertar);
				sentencia.execute(insertar);
				Thread.sleep(1500);
			}

			String actualizar = "update prueba set valor = 2.96 where id = 3";

			System.out.println(sentencia.execute(actualizar));

			String delete = "delete from prueba where id = 50";

			System.out.println(sentencia.execute(delete));

			String filtro = JOptionPane.showInputDialog("Indica el id a buscar");

			String seleccion = "select id ,descripcion ,fecha ,activo, valor from prueba where descripcion = '" + filtro
					+ "'";

			System.out.println(seleccion);
			ResultSet resultado = sentencia.executeQuery(seleccion);

			while (resultado.next()) {
				int id = resultado.getInt("id");
				String descripcion = resultado.getString("descripcion");
				LocalDateTime fecha = DateUtils.getLocalDateTime(resultado.getString("fecha"),
						DateUtils.FORMAT_YYYY_MM_DD_HH_MM_SS_24H);
				boolean activo = resultado.getBoolean("activo");
				double valor = resultado.getDouble("valor");

				String cadena = "id = " + id + " , descripcion = " + descripcion + ", fecha = " + fecha + ", activo = "
						+ activo + ", valor = " + valor + "";
				System.out.println(cadena);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
