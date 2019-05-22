package com.utn.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	static String db = "persona";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;

	Connection conn = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Conexion a la base de datos " + db + " Ok");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Connection getConecction() {
		return conn;
	}

	public void desconectar() {
		conn = null;
	}

}
