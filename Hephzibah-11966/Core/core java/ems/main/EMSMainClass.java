package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.Find all 6.Exit");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}
	
	public static Employee insertEmployee() {
		System.out.println("Enter employee id, name, salary and dno");
		return new Employee(sc.nextInt(), sc.next(),sc.nextInt(), sc.nextInt());
	}
	public static int deleteEmployee() {
		System.out.println("Enter employee id to delete");
		return sc.nextInt();
	}
	public static Employee updateEmployee() {
		System.out.println("Enter employee id, name, salary and dno to update");
		return new Employee(sc.nextInt(), sc.next(),sc.nextInt(), sc.nextInt());
	}
	public static int findEmployee() {
		System.out.println("Enter employee id to find");
		return sc.nextInt();
	}
//	public static int findAllEmployee() {
//		System.out.println("Enter employee id to find");
//		return sc.nextInt();
//	}

		

	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
//		int n=0;
		String msg="";
		do {
			switch(displayMenu()) {
			case 1:
//				Employee emp=insertEmployee();
//				int n=dao.insertEmployee(emp);
				if(dao.insertEmployee(insertEmployee())==1)
					System.out.println("Record Inserted");
				else {
					System.out.println("Record Not Inserted");
				}
				break;
			case 2:
				
				if(dao.deleteEmployee(deleteEmployee())==1)
					System.out.println("Record deleted");
				else {
					System.out.println("Record Not deleted");
				}
				break;
			case 3:
//				Employee emp=updateEmployee();
//				int n1=dao.updateEmployee(emp);
				if(dao.updateEmployee(updateEmployee())==1) {
					System.out.println("Record Updated");
				}else {
					System.out.println("Record not updated");
				}
				break;
			case 4:
				int id1=findEmployee();
				Employee bean=dao.findEmployee(id1);
				if(bean!=null) {
					bean.display();
				}
				else {
					System.out.println("Record not found");
				}
				break;
			case 5:
				List<Employee> list=dao.findAllEmployee();
				for(Employee e:list)
					e.display();
				break;
								
			}
			System.out.println("Do you want to continue [Yes|No]:");
			msg=sc.next();
		}while(msg.equals("Yes"));
		

	}

}
