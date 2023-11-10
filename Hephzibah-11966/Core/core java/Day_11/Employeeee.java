package Day_11;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	float salary;
	
	Employee(int id, String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}
}

public class Employeeee {

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
		System.out.println("1.Add Employee 2.Find Employee 3.Update Employee 4.Delete Employee 5.View Employee 6.Exit");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter employee id, name and salary");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextInt();
			Employee emp=new Employee(id,name,salary);
			list.add(emp);
			System.out.println("Employee details are added");
			break;
		case 2:
			System.out.println("Enter the employee id to find");
			id=sc.nextInt();
			flag=false;
			for(Employee e:list) {
				if(e.id==id) {
					flag=true;
					e.display();
					break;
				}
			}
			if(flag==false) {
				System.out.println("Employee not found");
			}
			break;
			
		case 3:
			System.out.println("Enter employee id, name and salary to update");
			id=sc.nextInt();
			name=sc.next();
			salary=sc.nextInt();
			Employee temp=new Employee(id,name,salary);
			
			flag=false;
			for(Employee e:list) {
				if(e.id==id) {
					flag=true;
					list.set(index, temp);
					System.out.println("Employee details are updated");
					break;
				}
			if(flag==false) {
				System.out.println("Employee not found");
			}
		}
			break;
			
		case 4:
			System.out.println("Enter the employee id to Remove");
			id=sc.nextInt();
			flag=false;
			
			for(Employee e:list) {
				if(e.id==id) {
					flag=true;
					list.remove(index);
					System.out.println("Employee details are Removed");
					break;
				}
				index++;
			}
			if(flag==false) {
				System.out.println("Employee not found");
			}
			break;
			
		case 5:
			for(Employee e:list)
				e.display();
			break;
			
		case 6:
			System.exit(0);
			break;
		}
		System.out.println("Do you want to continue (yes/no)");
		msg=sc.next();
		
	}while(msg.equalsIgnoreCase("yes"));

	}
}
