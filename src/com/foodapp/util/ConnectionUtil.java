package com.foodapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {

	/**
	 * This method returns the database connection
	 */
	public static Connection getConnection() {

		String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String username = "rev_user";
		String password = "rev_user";
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		}
		// multicatch
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect db");
		}

		return connection;
	}

	/**
	 * This method will close connection resources
	 */
	public static void close(Statement statement, Connection connection) {
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
