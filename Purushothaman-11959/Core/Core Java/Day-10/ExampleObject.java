package com.purushoth.day_10;

import java.util.LinkedList;
import java.util.Scanner;

class Employee {
	int id; 
	String name;
	float salary;

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee id : " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
		System.out.println("----------");
	}
}
public class ExampleObject {

	public static void main(String[] args) {
		int id=0;
		String name="";
		float salary=0.0f;
		boolean flag=false;
		int index=0;
		
		LinkedList<Employee> list=new LinkedList<Employee>();
		Scanner sc=new Scanner(System.in);
		String msg="";
		
		do {
		System.out.println("1.Add Employee \n2.Find Employee \n3.Update Employee \n4.Delete Employee \n"
				+ "5.View All Employee \n6.Exit");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter the employee id: ");
			id=sc.nextInt();
			System.out.println("Enter the employee name: ");
			name=sc.next();
			System.out.println("Enter the employee salary: ");
			salary=sc.nextFloat();
			Employee emp=new Employee(id,name,salary);
			list.add(emp);
			System.out.println("Employee details added");
			break;
			
		case 2:
			System.out.println("Enter the employee id: ");
			id=sc.nextInt();
			for(Employee a:list) {
				if(a.id==id) {
					flag=true;
					a.display();  //Find
					break;
				}
			}
			if(flag == false) {
				System.out.println("Employee not found");
			}
			break;
			
		case 3:
			System.out.println("Enter the employee id: ");
			id=sc.nextInt();
			System.out.println("Enter the employee name: ");
			name=sc.next();
			System.out.println("Enter the employee salary: ");
			salary=sc.nextFloat();
			Employee temp=new Employee(id,name,salary);
			index=0;
			flag=false;
			for(Employee a:list) {
				if(a.id==id) {
					flag=true;
					list.set(index, temp);
					System.out.println("Employee details are updated");
					break;
				}
				index++;
			}
			if(flag==false) {
				System.out.println("Employee details not found");
			}
			break;
			
		case 4:
			System.out.println("Enter the Employee id: ");
			id=sc.nextInt();
			flag=false;
			index=0;
			for(Employee a:list) {
				if(a.id==id) {
					flag=true;
					//Remove
					list.remove(index);
					System.out.println("Employee details are removed");
					break;
				}
				index++;
			}
			if(flag == false) {
				System.out.println("Employee not found");
			}
			break;
			
		case 5:
			if(list.isEmpty()) {
				System.out.println("Employee details are Empty");
			}else {
			for(Employee a:list) {
				a.display();
			}
			}
			break;
		case 6:
			System.out.println("Get's Exited");
			System.exit(0);
			break;
		default:
			System.out.println("Please select only from 1-6");
		}
		
			
		System.out.println("Do you want to continue [Yes | No]");
		msg=sc.next();
	}while(msg.equalsIgnoreCase("yes"));

	}

}
