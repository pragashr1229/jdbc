package com.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDEx1 {
	static Connection connection = null;

	public static void main(String[] args) throws SQLException {
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = JDBCUtil.getJdbcConnection();

			Statement stmt = connection.createStatement();

			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");
			stmt.execute("insert into employee values (1,'RAHUL','A',10000)");
			stmt.execute("insert into employee values (2,'RamanBargsv','A',20000)");
			stmt.execute("insert into employee values (3,'RAHUL','A',30000)");

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
