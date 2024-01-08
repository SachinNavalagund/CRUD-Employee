package com.CRUD.Main;

import java.util.Scanner;

import com.CRUD.Pojo.Employee;
import com.CRUD.Service.Service;

public class Main 
{
	public static void main(String[] args)
	{
		//		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		Scanner scanner = null;
		while(true)
		{
			System.out.println("Choices");
			System.out.println("1. Insert");
			System.out.println("2. SelectAll");
			System.out.println("3. Select");
			System.out.println("4. Delete");
			System.out.println("5. Update");
			System.out.println("6. Exit");

			scanner = new Scanner(System.in);
			System.out.print("Enter your Choices : ");
			int choice = scanner.nextInt();




			switch (choice)
			{
			case 1:
				System.out.print("Enter Name");
				String ename =scanner.next();

				System.out.print("Enter Employee Address : ");
				String address = scanner.next();

				System.out.print("Enter Employee Salary : ");
				double esalary = Double.parseDouble(scanner.next());

				Employee employee = new Employee(ename, address, esalary) ;
				service.insertEmpolyee(employee);
				break;

			case 2:
				service.selectAllEmployee();

				break;

			case 3:
				System.out.print("Enter Employee ID : ");
				int eid =Integer.parseInt(scanner.next());
				service.selectEmployeeQuery(eid);
				break;

			case 4:
				System.out.print("Enter Employee ID : ");
				int empid =Integer.parseInt(scanner.next());
				service.deleteEmployeeById(empid);
				break;

			case 5:
				System.out.print("Enter Employee ID : ");
				int upid =Integer.parseInt(scanner.next());
				boolean isFound = service.selectEmployeeQuery(upid);
				if(isFound)
				{

					System.out.print("Enter Employee Name : ");
					String eName =scanner.next();

					System.out.print("Enter Employee Address : ");
					String address1 = scanner.next();

					System.out.print("Enter Employee Salary : ");
					double eSalary = Double.parseDouble(scanner.next());

					Employee employe = new Employee(upid, eName, address1, eSalary) ;
					service.updateEmployee(employe);
				}
				break;

			case 6:
				System.out.println("Exited");
				break;

			default :
				System.out.println("Enter Correct choice");
				break;
			}
		}
	}
}
