package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMSMainClass {
    static  Scanner sc = new Scanner(System.in);
	public static int displaymenu(){
		System.out.println("1. Insert 2.delete 3.Update 4.Find 5.Find All 6.Exit");
        System.out.println("Enter your choice:");
        return sc.nextInt();
        
	}
	public static Employee insertEmployee() {
		System.out.println("Enter Employee id,name,salary and dno");
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
		
	}
	
	public static int deleteEmployee() {
		System.out.println("Enter the Id to delete");
		return sc.nextInt();
	}
	
	public static Employee updateEmployee() {
		System.out.println("Enter Employee id,name,salary and dno :");
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
	}
	
	public static int findEmployee() {
		System.out.println("Enter the Id to Find");
		return sc.nextInt();
	}
	
	
	public static void main(String[]args) {
		EmployeeDAO dao = new EmployeeDAO();
	  String msg = "";
		do {
			switch(displaymenu()) {
			case 1:
//				Employee emp = insertEmployee();
//				dao.insertEmployee(emp);
				
				if(dao.insertEmployee(insertEmployee()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record is not inserted");
				break;
			case 2:
				int id = deleteEmployee();
				int n = dao.deleteEmployee(id);
				if(n==1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record is not Deleted");
				break;
			case 3:
				Employee emp = updateEmployee();
				int n1 = dao.updateEmployee(emp);
				if(n1==1)
					System.out.println("Record Updated");
				else
					System.out.println("Record Not Updated ");
				break;
                 
			case 4:
				int id1 = findEmployee();
				Employee bean = dao.findEmployee(id1);
				if(bean != null) {
					bean.display();	
					}else {
						System.out.println("Record Not Found");
					}
				break;
			case 5:
				List<Employee> list = dao.findAllEmployee();
				for(Employee e:list) {
					e.display();
				}
				break;
				
				}		
			System.out.println("Do you want ot continue [Yes|No]");
			msg=sc.next();
		}while(msg.equals("Yes"));
	}

}
