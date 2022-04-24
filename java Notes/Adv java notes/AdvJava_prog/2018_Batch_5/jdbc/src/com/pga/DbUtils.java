package com.pga;
import java.sql.*;
// Make sure only once DB connection is created.
public class DbUtils {
	// static block
	static Connection con = null;
	static {
		try {
			// mysql-5
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			con = DriverManager.getConnection
					("jdbc:mysql://localhost/pga","root","");
			System.out.println("Connection success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getDbConnection() {
		return con;
	}
}






