package com.CRUD.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection 
{
	public static void main(String[] args)
	{
		getConnection();
	}
	private static final String url ="jdbc:mysql://localhost:3306/std";
	private static final String username ="root";
	private static final String password ="root123";

	static Connection connection = null;

	public static Connection getConnection() 
	{
		try 
		{
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established....");

			return connection;

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
