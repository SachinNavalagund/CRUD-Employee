package com.CRUD.Pojo;

public class Employee 
{
	//properties
	private int eid;
	private String ename;
	private String eaddress;
	private double esalary;

	public Employee(int eid, String ename, String eaddress, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
	}

	//paramaterized constructor for proprties
	public Employee() 
	{
		super();
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
	}



	public Employee(String ename, String eaddress, double esalary) {
		super();
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
	}



	//getters and setters for properties
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}

	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public String getEaddress() 
	{
		return eaddress;
	}
	public void setEaddress(String eaddress) 
	{
		this.eaddress = eaddress;
	}

	public double getEsalary() 
	{
		return esalary;
	}
	public void setEsalary(double esalary) 
	{
		this.esalary = esalary;
	}


}
