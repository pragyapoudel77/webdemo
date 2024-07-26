package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getDbCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb", "root","12345678");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
