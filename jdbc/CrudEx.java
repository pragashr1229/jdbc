package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudEx {
	static Connection connection = null;

	public static void main(String[] args) throws SQLException {
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = JDBCUtil.getJdbcConnection();

			// sending SQL statements to the database.SQL statements without parameters are
			// normally executed using Statement objects.
			// If the same SQL statementis executed many times, it may be more efficient to
			// use a PreparedStatement object.
			Statement selectStmt = connection.createStatement();

			// executeQuery- Executes the given SQL statement, which returns a single
			// ResultSet object.

			ResultSet rs = selectStmt
					.executeQuery("SELECT ID,FIRST_NAME,LAST_NAME,Salary FROM EMPLOYEE WHERE ID <= 10");
			
			while(rs.next())
			{
			    System.out.println(rs.getString(1));    //First Column
			 //   System.out.println(rs.getString(2));    //Second Column
			  //  System.out.println(rs.getString(3));    //Third Column
			   // System.out.println(rs.getString(4));    //Fourth Column
			}

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
