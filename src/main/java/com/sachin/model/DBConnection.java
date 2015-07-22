package com.sachin.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);

			if (con != null)
				con.setAutoCommit(false);

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		return con;
	}

	public static int connectionClose(Connection con) {
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return -1;
			}

		return 1;
	}
	
	public static String url = "jdbc:mysql://localhost:3306/projectschool";
	public static String user = "project";
	public static String password = "password";
}