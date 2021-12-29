package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//a prepared statement or parameterized statement is a feature used to execute the same or 
//similar database statements repeatedly with high efficiency
public class PreparedStatementEx {
	static Connection connection = null;

	public static void main(String[] args) throws SQLException {
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = JDBCUtil.getJdbcConnection();
			
			String sql="insert into employee values (?,?,?,?)";  


			PreparedStatement stmt=connection.prepareStatement(sql);
			
			for(int i=0;i<100;i++) {
				
			stmt.setInt(1, 100+i);
			stmt.setString(2, "Ram"+i);
			stmt.setString(3, "B"+i);
			stmt.setLong(4,10000+i);

			stmt.executeUpdate();
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
