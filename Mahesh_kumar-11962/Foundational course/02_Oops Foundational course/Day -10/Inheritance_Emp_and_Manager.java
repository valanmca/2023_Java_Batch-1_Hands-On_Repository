package com.mahesh.Oops_day10;

class Member {
	String name, address,ph_no;
	int age, salary;
	

	Member(String name, String address, int age, int salary, String ph_no) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.ph_no = ph_no;
	}

	int printSalary()
	{
		return salary;
	}
}
class Employees extends Member
{
	String Specialization,department;

	Employees(String name, String address, int age, int salary,String ph_no,String Specialization,String department)
	{
	super( name, address, age, salary, ph_no);
	
		this.Specialization=Specialization;
		this.department =department;
	}
	
	void displayemp()
	{
		System.out.println("\n");
		System.out.println("Employee name :"+name);
		System.out.println("Employee age :"+age);
		System.out.println("Employee address :"+address);
		System.out.println("Employee phone_no :"+ph_no);
		System.out.println("Employee salary :"+printSalary());
		System.out.println("Employee Specialization :"+Specialization);
		System.out.println("Employee Department :"+department);
	}
}
class Manager extends Member
{
	String Specialization,department;
	Manager(String name, String address, int age, int salary, String ph_no,String Specialization,String department)
	{
		super(name, address, age, salary, ph_no);
	
		this.Specialization=Specialization;
		this.department =department;
	}

	void display()
	{
		System.out.println("\n");
		System.out.println("Manager name :"+name);
		System.out.println("Manager age :"+age);
		System.out.println("Manager address :"+address);
		System.out.println("Manager phone_no :"+ph_no);
		System.out.println("Manager salary :"+printSalary());
		System.out.println("Manager Specialization :"+Specialization);
		System.out.println("Manager Department :"+department);
	}
}

public class Inheritance_Emp_and_Manager {

	public static void main(String[] args) {
		
		Employees mah = new Employees("Mahesh","57,Sivan mada veethi,sivakasi.",23,15000,"8925215100","JAVA","IT");
		mah.displayemp();

		Manager dominic = new Manager("Dominic dev","123/23 Dubai main road,dubai.",23,55000,"90394890032",".NET","IT");
		dominic.display();

	}

}
