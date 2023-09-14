package com.purushoth.day10;

class Member{
	String name;
	int age;
	String ph_no;
	String address;
	float salary;
	
	Member(String name,int age,String ph_no,String address,float salary){
		this.name=name;
		this.age=age;
		this.ph_no=ph_no;
		this.address=address;
		this.salary=salary;
		
	}
	
	float printSalary() {
			return salary;
		}
	}

class Employee2 extends Member{
	String specialization,department;
	
	Employee2(String name,int age,String ph_no,String address,float salary,String specialization,String department){
		super(name,age,ph_no,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	void display() {
		System.out.println("Employee name: "+name);
		System.out.println("Employee age: "+age);
		System.out.println("Employee Ph.no: "+ph_no);
		System.out.println("Employee address: "+address);
		System.out.println("Employee salary: "+printSalary());
		System.out.println("Employee Specialization: "+specialization);
		System.out.println("Employee department: "+department+"\n");
		
	}

}

class Manager extends Member{
	String specialization,department;
	
	Manager(String name,int age,String ph_no,String address,float salary,String specialization,String department){
		super(name,age,ph_no,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	void display() {
		System.out.println("Manager name: "+name);
		System.out.println("Manager age: "+age);
		System.out.println("Manager Ph.no: "+ph_no);
		System.out.println("Manager address: "+address);
		System.out.println("Manager salary: "+printSalary());
		System.out.println("Manager Specialization: "+specialization);
		System.out.println("Manager department: "+department);
		
	}
	
}
public class MemberInheritance {

	public static void main(String[] args) {
		Employee2 obj=new Employee2("Kumar",27,"9678234567","Vellore",20000.0f,"Java","IT");
		obj.display();
		
		Manager obj1=new Manager("Santhosh",27,"9678342312","Chennai",30000.0f,".net","CSE");
		obj1.display();

	}

}//Inheritance to the member of employee and manager.
