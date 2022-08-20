package com.educaciontit.Clase19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import com.octaviorobleto.commons.utilities.text.StringUtils;
import com.octaviorobleto.commons.utilities.time.DateUtils;

public class AppSentenciaPreparada {
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

			String insertar = "insert into prueba (descripcion,fecha,activo,valor) values (?,?,?,?)";

			PreparedStatement sentenciaPreparada = conexion.prepareStatement(insertar);

			for (int i = 0; i < 50; i++) {
				sentenciaPreparada.setString(1, "Alumno " + StringUtils.leftPad(("" + (i + 1)), 10, "0**0"));
				sentenciaPreparada.setString(2, LocalDateTime.now().toString());
				sentenciaPreparada.setBoolean(3, (i % 2) == 0);
				sentenciaPreparada.setDouble(4, (Math.random() * 1000));

				System.out.println(sentenciaPreparada);
				sentenciaPreparada.execute();
				Thread.sleep(1500);
			}

			String filtro = JOptionPane.showInputDialog("Indica el filtro: ");
			String query = "select id ,descripcion ,fecha ,activo, valor from prueba where descripcion = ?";
			PreparedStatement seleccionarPreparada = conexion.prepareStatement(query);
			seleccionarPreparada.setString(1, filtro);

			System.out.println(seleccionarPreparada);
			ResultSet resultado = seleccionarPreparada.executeQuery();

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
