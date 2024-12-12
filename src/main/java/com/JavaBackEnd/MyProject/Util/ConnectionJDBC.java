package com.JavaBackEnd.MyProject.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.naming.java.javaURLContextFactory;

public class ConnectionJDBC {
	
	static final String URL_STRING = "jdbc:mysql://localhost:3306/estatebasic";
	static final String PASS_STRING = "Giabao1234@";
	static final String USER_STRING = "root";
	public static Connection getConnection(){
		try{
			Connection connection = DriverManager.getConnection(URL_STRING, USER_STRING, PASS_STRING);
			return connection;
		}
		catch(SQLException e) {
			System.err.println("SQL connection error!!!");
			return null;
		}
	}
}
