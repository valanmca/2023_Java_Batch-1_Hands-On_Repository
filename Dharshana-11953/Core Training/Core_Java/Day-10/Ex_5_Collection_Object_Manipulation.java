package com.dharshu.day10;

import java.util.LinkedList;
import java.util.Scanner;

class Employees {
	int id;
	String name;
	float salary;
	
	Employees (int id, String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
		System.out.println("---------------------------");
	}
}

public class Ex_5_Collection_Object_Manipulation {

	public static void main(String[] args) {
		int id=0;
		String name="";
		float salary = 0.0f;
		boolean flag=false;
		int index=0;
		LinkedList<Employees> list=new LinkedList<Employees>(); //collection
		Scanner sc= new Scanner(System.in);
		
		String msg="";
		
		do {
		System.out.println("1.Add Employee 2.Find Employee 3.Update Employee 4.Delete Employee 5.View All Employee 6.Exit");
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter Employee id,name and salary");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			Employees emp=new Employees(id,name,salary);
			list.add(emp);
			System.out.println("Employee Details are Added");
			break;
		case 2:
			System.out.println("Enter Employee Id to Find");
			id=sc.nextInt();
			flag= false;
			for(Employees e:list) {
				if(e.id == id) {
					flag = true;
					e.display();
					break;
				}
			}
			if(flag == false) {
				System.out.println("Employee Not Found");
			}
			break;
		case 3:
			System.out.println("Enter Employee id,name and salary to Update");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			Employees temp=new Employees(id,name,salary);
			 index=0;
			flag=false;
			for(Employees e:list) {
				if(e.id == id) {
					flag=true;
					list.set(index, temp);
					System.out.println("Employee Details are Updated");
					break;
				}
				index++;
			}
			if(flag == false) {
				System.out.println("Record Not Found");
			}
			break;
		case 4:
			System.out.println("Enter Employee Id to Delete");
			id=sc.nextInt();
			flag = false;
		    index=0;
			for(Employees e:list) {
				if(e.id == id) {
					flag = true;
					//Remove
					list.remove(index);
					System.out.println("Employee Details are Deleted");
					break;
				}
				index++;
			}
			if(flag == false) {
				System.out.println("Employee Not Found");
			}
			break;
		case 5:
			System.out.println("Displaying the Employee Details");
			for(Employees e: list) {
				e.display();
			}
			break;
		case 6:
			System.exit(0);
			break;
		}
		System.out.println("Do You Want to Continue [Yes | No]");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("yes"));
	}

}
