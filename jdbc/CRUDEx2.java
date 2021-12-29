package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDEx2 {
	static Connection connection = null;

	public static void main(String[] args) throws SQLException {
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = JDBCUtil.getJdbcConnection();

			Statement stmt = connection.createStatement();

			stmt.execute("DELETE FROM EMPLOYEE WHERE ID > 2 ");

		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found !!");
			return;
		} finally {
			try {
				if (connection != null)
					connection.close();
				System.out.println("Connection closed !!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
