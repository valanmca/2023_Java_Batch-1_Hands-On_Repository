package com.jeyandhan.day11;

import java.util.LinkedList;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	float salary;
	
	Employee(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("\n--------------------");
		System.out.println("Id: " +id);
		System.out.println("Name: " +name);
		System.out.println("Salary: " +salary);
		System.out.println("--------------------");
	}
}

public class Employees {

	public static void main(String[] args) {
		int id =0;
		String name ="";
		float salary = 0.0f;
		boolean flag = false;
		String msg ="";
		int index = 0;
		LinkedList<Employee> list = new LinkedList<Employee>();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.println("***********************");
		System.out.println("1) Add Employee \n2) Find Employee \n3) Update Employee \n4) Delete Employee \n5) View all Employee \n6) Exit");
		System.out.println("***********************");
		System.out.println("\nEnter you choice");
		int choice = sc.nextInt();
	
		
		switch (choice) {
		
		case 1: 
			
			System.out.println("Enter employee id: ");
			id = sc.nextInt();
			System.out.println("Enter employee name: ");
			name = sc.next();
			System.out.println("Enter employee salary: ");
			salary = sc.nextFloat();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			System.out.println("Employee Details are added");
			break;
			
		case 2: 
			
			System.out.println("Enter the Employee ID to find...");
			id = sc.nextInt();
			flag = false;
			
			for(Employee e: list) { // for each loop
				if(e.id == id) { // checks the user id is present or not
					flag = true;
					e.display(); //display the employee details
					break;
				}
			}
			if(flag == false) {
				System.out.println("Employee Not Found");
			}
			break;
			
		case 3: 
			
			System.out.println("Enter the Employee Id: ");
			id = sc.nextInt();
			System.out.println("Enter the Name: ");
			name = sc.next();
			System.out.println("Enter the Salaray: ");
			salary = sc.nextFloat();
			index = 0;
			flag = false;
			
			Employee temp = new Employee(id, name, salary); //temporary object
			
			for(Employee e: list) { //for each
				
				if(e.id == id) {
					list.set(index, temp); //update the value with index and object
					System.out.println("Employee Details are Updated");
					break;
				}
				index++;
			}
			break;
			
		case 4: 
			System.out.println("Enter the Employee id to delete" );
			id = sc.nextInt();
			index = 0;
			flag = false;
			for(Employee e: list) { // for each loop
				if(e.id == id) { // checks the user id is present or not
					flag = true; 
					list.remove(index); // removing the value from the list using index
					System.out.println("Employee details are removed");
					break;
				}
				index++; //Increment the value at each iteration
			}
			if(flag == false) {
				System.out.println("Employee Not Found");
			}
			break;
			
		case 5: 
			flag = false;
			for(Employee e: list) {
				if(!list.isEmpty())
				 flag = true;
				e.display();
				
			}
			if(flag == false) {
				System.out.println("No Records");
			}
			
			break;
			
		case 6: 
			System.exit(0);
			break;
		
		default:
			System.out.println("Please select valid options(1-6) only");
			break;
		}
		System.out.println("Do you want to continye [Yes | No]");
		msg = sc.next();
		}while(msg.equalsIgnoreCase("yes"));
	sc.close();
	}
	
}
