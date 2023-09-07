package com.shiva.day10;


class Member
{
	String Name;
	int age;
	long phoneno;
	String address;
	int salary;
	
	//constructor
	Member(String Name,int age,long phoneno,String address,int salary)
	{
		this.Name=Name;
		this.age=age;
		this.phoneno=phoneno;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary()
	{
		System.out.println("Salary : "+salary);
	}
}

class Employee2 extends Member
{
	String specialization;
	String department;
	
	Employee2(String specialization,String department)
	{
		super("Shiva",20,9788208899l,"Madurai",8000);
		this.specialization=specialization;
		this.department=department;
	}
}

class Manager extends Member
{
	String specialization;
	String department;
	
	Manager(String Name,int age,double phoneno,String address,int salary,String specialization,String department)
	{
		super("Shiva",20,9788208899l,"Madurai",8000);
		this.specialization=specialization;
		this.department=department;
	}
	
	void display()
	{
		System.out.println("Name : "+Name);
		System.out.println("Age : "+age);
		System.out.println("phoneno : "+phoneno);
		System.out.println("Address : "+address);
		System.out.println("salary : "+salary);
		
	}
}

public class Assign1 {

	public static void main(String[] args) {
		
		Member obj=new Member("Shiva",20,9788208899l,"Madurai",8000);
		obj.printSalary();
		
		Manager obj1=new Manager("Shiva",20,9788208899l,"Madurai",8000,"Computer","EEE");
		obj1.display();

	}

}
