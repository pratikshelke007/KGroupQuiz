package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	
	public static Connection getDBConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Quizdatabase?characterEncoding=utf8";
			con=DriverManager.getConnection(url,"root","root");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

		return con;
		
	}
	
}
