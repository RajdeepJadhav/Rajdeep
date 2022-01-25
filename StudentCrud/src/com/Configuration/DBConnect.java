package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL="jdbc:mysql://localhost:3306/crudoperation?useSSL=false";
	private static final String USER="root";
	private static final String PASS="1daredevil";
	
	static Connection con;
	
	public static Connection getConnection() 
	{

		try {
			Class.forName(JDBC_DRIVER);
//			System.out.println("Driver loaded successfully");
//			System.out.println("Connecting to database...");
			con=DriverManager.getConnection(JDBC_URL, USER, PASS);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		Connection con=DBConnect.getConnection();
		if(con!=null) 
		{
			System.out.println("Connected successfully!!");
		}
		else
			System.out.println("Connection failed!");
		
		

	}

}
