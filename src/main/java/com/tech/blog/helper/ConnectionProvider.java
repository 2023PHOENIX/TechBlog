package com.tech.blog.helper;

import java.sql.*;

public class ConnectionProvider {

	private static Connection connection;

	public static Connection getConnection() {
		try {

			if (connection == null) {
				// driver class load at runtime.
				Class.forName("com.mysql.cj.jdbc.Driver");

				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytechblog", "root", "admin");
				
				System.out.println(connection);
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
			return connection;
	}

}
