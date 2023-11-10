package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

public class EMSMainClass {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int displayMenu()
	{
		
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.Find all 6.Exit");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static Employee insertEmployee()
	{
		System.out.println("Enter student id, student name, student department");
		return new Employee(sc.nextInt(),sc.next(),sc.next());
	}
	
	public static int deleteEmployee()
	{
		System.out.println("Enter student id");
		return sc.nextInt();
	}
	
	public static Employee updateEmployee()
	{
		System.out.println("Enter student id, student name, student department");
		return new Employee(sc.nextInt(),sc.next(),sc.next());
	}
	
	public static int findEmployee()
	{
		System.out.println("Enter student id");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
		String msg="";
		do {
			switch(displayMenu())
			{
			case 1:
//				Employee emp=insertEmployee();
//				int n=dao.insertEmployee(emp);
				if(dao.insertEmployee(insertEmployee())==1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;
				
			case 2:
//				Employee emp=insertEmployee();
//				int n=dao.insertEmployee(emp);
				if(dao.deleteEmployee(deleteEmployee())==1)
					System.out.println("Record deleted");
				else
					System.out.println("Record Not deleted");
				break;
				
			case 3:
//				Employee emp=insertEmployee();
//				int n=dao.insertEmployee(emp);
				if(dao.updateEmployee(updateEmployee())==1)
					System.out.println("Record Updated");
				else
					System.out.println("Record Not Updated");
				break;
				
			case 4:
				int id1=findEmployee();
				Employee bean=dao.findEmployee(id1);
				if(bean!=null) {
					bean.display();
				}else {
					System.out.println("Record Not found");
				}
				break;
			
			case 5:
				List<Employee> list=dao.findAllEmployee();
				for(Employee e :list)
				{
					e.display();
				}
				break;
			}
			System.out.println("Do you want to continue [yes/no]:");
			msg=sc.next();
		}while(msg.equals("yes"));
		
	}

}
