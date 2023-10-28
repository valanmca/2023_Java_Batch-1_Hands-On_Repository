package com.core.day_09;

import java.util.LinkedList;
import java.util.Scanner;

class Employee{
	int id ;
	String name ;
	float salary;
	
	Employee(int id,String name,float salary)
	{
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee Id = "+id);
		System.out.println("Employee name = "+name);
		System.out.println("Employee salary = "+salary);
		
        System.out.println("--------------------");
		
	}
}

public class CollectionObject {

	public static void main(String[] args) {
		
		int id=0;
		String name=" ";
		float salary =0.0f;
		boolean flag=false;
		int index=0;
		String msg=" ";
		
		LinkedList<Employee> list=new LinkedList<Employee>();  // to store Employee object
		
		
		Scanner sc=new Scanner(System.in);
		
		do {
			
		System.out.println("1.AddEmployee  2.Find Employee  3.Update Employee 4.Delete Employee 5.view All employee 6.exit");
		
		System.out.println("Enter your choice ");
		
		int choice =sc.nextInt();
		
		
		switch(choice )
		{
		case 1:
		
			System.out.println("Enter employee id,name,salary");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			Employee emp1=new  Employee(id,name,salary);
			
			list.add(emp1);
			System.out.println("Employee details are added ");
		
			break;
			
		case 2:
			
			// find employee
			System.out.println("Enter the employe id to find");
			id=sc.nextInt();
			 flag=false;
			
			
			for(Employee e:list)
			{
				if (e.id==id )
				{
					flag=true;
					e.display();
					break;
				}
				
				}
			if (flag==false)   // if id not found so we use flag variable to find it 
			{
				System.out.println("Employee not found ");
			}
			
			break;

			
		case 3:
			System.out.println("Enter the Employee id,name,salary to update the details ");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextFloat();
			Employee temp=new Employee(id,name,salary);
			 index=0;
			flag=false;
			
			for(Employee e:list)
			{
				if(e.id==id)
				{
					flag=true;
					list.set(index, temp);
					System.out.println("Employee details are updated");
					break;
				}
				index++;
			}
			if (flag==false)
			{
				System.out.println("Record not found");
			}
			
			break;

			
		case 4:
			System.out.println("Enter the Employee id to delete  ");
			
			id=sc.nextInt();
			 flag=false;
			  index=0;
			
			
			for(Employee e:list)
			{
				if (e.id==id )
				{
					flag=true;
					// remove 
					list.remove(index);
					System.out.println("Employee details are removed");
					break;
				}
				index++;
				
				}
			if (flag==false)   // if id not found so we use flag variable to find it 
			{
				System.out.println("Employee not found ");
			}
			
			
			break;

			
		case 5:
			
			for(Employee e:list)
			{
				e.display();
			}
			break;

			
		case 6:
			
			System.out.println("You are exit from the application-");
			System.out.print("          ---------");
			System.out.println();
			System.out.print("          -       -");
			System.out.println();
			System.out.print("          -  RUN  -");
			System.out.println();
			System.out.print("          - AGAIN -");
			System.out.println();
			System.out.print("          -       -");
			System.out.println();
			System.out.print("          ---------");
			
			
			///------------------------------------
			
			
			
			System.exit(0);
			break;

			
		}
		
		System.out.println("Do you want to continue[yes]|[No]");
		msg=sc.next();
	}while (msg.equalsIgnoreCase("yes"));
		
	

	}

}
