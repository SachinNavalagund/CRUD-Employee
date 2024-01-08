package com.CRUD.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.CRUD.Connection.GetConnection;
import com.CRUD.Connection.Query;
import com.CRUD.Pojo.Employee;

public class Service 
{

	GetConnection getconn = new GetConnection();
	Connection connection= null;
	PreparedStatement preparedStatement = null;
	Statement statement = null;
	ResultSet resultSet = null;

	//Logic for InsertEmployee
	public void insertEmpolyee(Employee employee)
	{
		connection = getconn.getConnection();
		try
		{

			preparedStatement = connection.prepareStatement(Query.insertEmployeeQuery());

			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setString(2, employee.getEaddress());
			preparedStatement.setDouble(3, employee.getEsalary());

			int rowCount = preparedStatement.executeUpdate();
			if(rowCount>0)
			{
				System.out.println("Record created Successfully.....");
			}
			else
			{
				System.out.println("Insert Record Failed");
			}


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//logic for FetchingAllEmployee
	public void selectAllEmployee()
	{
		connection = getconn.getConnection();
		try 
		{
			statement = connection.createStatement();
			resultSet = statement.executeQuery(Query.selectAllEmployeeQuery());

			System.out.println("EID\tENAME\tEADDRESSE\tSALARY");

			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + 
						resultSet.getString(3) + "\t" + resultSet.getDouble(4));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	//Logic for selecting only one Employee by Id
	public boolean selectEmployeeQuery(int id)
	{
		boolean isFound = false;
		connection = getconn.getConnection();
		try 
		{
			statement = connection.createStatement();
			resultSet = statement.executeQuery(Query.selectEmployeeQuery(id));

			System.out.println("EID\tENAME\tEADDRESSE\tSALARY");

			if(resultSet.next())
			{
				isFound = true;
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + 
						resultSet.getString(3) + "\t" + resultSet.getDouble(4));
			}
			else
			{
				System.out.println("Record not found for id "+id);
			}


		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return isFound;
	}

	//Deleting the employee by ID
	public void deleteEmployeeById(int empid)
	{
		connection = getconn.getConnection();
		try 
		{
			statement = connection.createStatement();
			int rowCount = statement.executeUpdate(Query.deleteEmployeeQuery(empid));

			if(rowCount>0)
			{
				System.out.println("Record Deleted Successfully...");
			}
			else
			{
				System.out.println("Record has not been Deleted");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	//Update Employee By ID
	public void updateEmployee(Employee employee)
	{
		connection = getconn.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(Query.updateEmployeeQuery(employee.getEid()));
			;
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setString(2, employee.getEaddress());
			preparedStatement.setDouble(3, employee.getEsalary());

			int rowCount = preparedStatement.executeUpdate();
			if(rowCount>0)
			{
				System.out.println("Record Updated Successfully...");
			}
			else
			{
				System.out.println("Record has not been Updated");
			}

		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}






}
