package com.madhan.coreday10;

import java.util.LinkedList;
import java.util.Scanner;

class Employee1 
{
	 int id; 
	 String name;
	 float salary;
	
	Employee1(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("Employee Id:" +id);
		System.out.println("Employee Name:" +name);
		System.out.println("Employee Salary:" +salary);

	}
}


public class Employee {

	public static void main(String[] args) {
		int id=0;
		String name="";
		float salary=0.0f;
		boolean flag=false;
		int index=0;
			
		LinkedList<Employee1>list=new LinkedList<Employee1>();
		Scanner sc=new Scanner(System.in);
		String msg="";
		
		do {
		System.out.println("1.Add Employee \n2.Find Employee \n3.Update Employee \n4.Delete Employee \n5.View All Employee \n6.Exit");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		
		case 1:
			System.out.println("Enter Employee id,name and Salary :");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			Employee1 emp=new Employee1(id,name,salary);
			list.add(emp);
			System.out.println("Employee details are added");
			break;
			
		case 2:
			System.out.println("Enter employee id to find :");
			id=sc.nextInt();
			flag=false;
			for(Employee1 e : list)
			{
				if(e.id==id)
				{
					flag=true;
					e.display();
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Employee Not found");
			}
			break;
			
		 case 3:
			System.out.println("Enter Employee id,name and Salary :");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			Employee1 temp=new Employee1(id,name,salary);
			
			flag=false;
			for(Employee1 e:list)
			{
				if(e.id==id)
				{
					flag=true;
					list.set(index, temp);
					System.out.println("Employee details are updated");
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Employee Not found");
			}
			break;
			
		case 4:
			System.out.println("Enter employeeid to remove :");
			id=sc.nextInt();
			flag=false;
		
			for(Employee1 e : list)
			{
				if(e.id==id)
				{
					flag=true;
					list.remove(index);
					System.out.println("Employee details removed");
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Employee Not found");
			}
			break;
			
		case 5:
			for(Employee1 e:list)
			e.display();
			break;
			
		case 6:
			System.exit(0);
			break;
		
		}
		System.out.println("Do you want to continue (Y/N)");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("Y"));
	}
		

}
