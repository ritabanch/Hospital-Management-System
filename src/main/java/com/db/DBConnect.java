package com.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn;
	
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management","root","Ritaban@967969");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
 		
		return conn;
	}

}
