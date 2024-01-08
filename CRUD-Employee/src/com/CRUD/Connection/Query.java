package com.CRUD.Connection;

public class Query 
{
	//Query for inserting Records
	public static String insertEmployeeQuery()
	{
		return "INSERT INTO employee(ename, eaddress, esalary) VALUES(?,?,?)";
	}

	//Query for Fetching all the records from table
	public static String selectAllEmployeeQuery() 
	{
		return "select * from employee";
	}

	//Query for Fetching only one Employee
	public static String selectEmployeeQuery(int id) 
	{
		return "select * from employee where eid = " + id;
	}

	//Query fro Deleting Employee
	public static String deleteEmployeeQuery(int empid)
	{
		return "delete from employee where eid = "+ empid;
	}

	//Query for Updating Eployee
	public static String updateEmployeeQuery(int upid)
	{
		return "update employee set ename= ? , eaddress= ? , esalary= ? where eid= " + upid;
	}

}
