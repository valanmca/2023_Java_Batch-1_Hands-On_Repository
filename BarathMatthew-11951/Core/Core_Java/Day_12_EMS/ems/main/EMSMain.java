package com.ems.main;
import java.util.List;
import java.util.Scanner;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
public class EMSMain {

	static Scanner sc= new Scanner(System.in);
	
	public static int displayMenu() {
		System.out.println("1.Insert 2.Delete 3.Update 4.Find 5.Find All 6.Exit");
		System.out.println("Enter your choice : ");
//		return the value enter by the user 
		return sc.nextInt();
		
	}
	
	public static Employee insertEmployee() {
		System.out.println("Enter Employee id,name,salary and dno");
//		returning without reference.
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
		
	}
	
	public static int deleteEmployee() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
		
	}
	
	public static Employee updateEmployee() {
		System.out.println("Enter Employee id,name,salary and dno");
//		returning without reference.
		return new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
		
	}
	
	public static int findEmployee() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		String msg ="";
		
		do {
			switch(displayMenu()) {
			
			case 1:

				if(dao.insertEmployee(insertEmployee())== 1) {
					System.out.println("Record inserted");
				}
				else {
					System.out.println("Record not inserted");
				}
				break;
				
			case 2: 
				int id = deleteEmployee();
				int n = dao.deleteEmployee(id);
				
				if(n==1) {
					System.out.println("Record deleted");
				}
				else {
					System.out.println("Record not deleted");
				}
				break;
			case 3:
				Employee emp=  updateEmployee();
				int n1 = dao.updateEmployee(emp);
				
				if(n1==1) {
					System.out.println("Record Updated");
				}
				else {
					System.out.println("Record not Updated");
				}
				break;
			case 4:
				int id1 = findEmployee();
				Employee been = dao.findEmployee(id1);
				
				if(been !=null) {
					been.display();
				}
				else {
					System.out.println("Record not found");
				}
				break;
				
			 case 5:
	                List<Employee> list = dao.findAllEmployee();
	                for(Employee e:list) {
	                    e.display();
	                }
	                break;
				
			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		}while(msg.equals("yes"));
		

	}

}
