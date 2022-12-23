package com.masai.utiltiy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {

	private static String drivername;
	private static String url;
	private static String username;
	private static String password;
	
	
	static {
		
	ResourceBundle rb = ResourceBundle.getBundle("dbdetails");	
		
	drivername = rb.getString("db.drivername");
	url = rb.getString("db.url");
	username= rb.getString("db.username");
	password = rb.getString("db.password");
	
		
		
	}
	
	
	
	
	
	public static Connection provideConnection() {
		
		Connection conn=null;
		
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String url="jdbc:mysql://localhost:3306/sb101db";
		
		
		
		try {
			conn= DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return conn;
		
	}
	
	
}
