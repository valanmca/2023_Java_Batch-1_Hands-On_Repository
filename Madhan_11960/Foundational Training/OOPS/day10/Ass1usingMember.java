package com.madhan.day10;

class Member
{
	//variable
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	
	//constructor
	Member(String name,int age,long phoneno,String address,int salary)
	{
		this.name=name;
		this.age=age;
		this.phoneno=phoneno;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary()
	{
		System.out.println("Salary:" +salary);
		
	}
}


	
class Manager extends Member
{
	String specialization;
	String department;
	
	Manager(String specialization,String department)
	{
	  super("Madhan",23,9994710405l,"2/187 Virudhunagar",50000);
	  this.specialization=specialization;
	  this.department=department;
    }
	
	void print()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phonenumber:"+phoneno);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
		
	}
}

public class Ass1usingMember {

	public static void main(String[] args) {
		Member obj1=new Member("Madhan",23,9994710405l,"2/187, Virudhunagar",50000);
         obj1.printSalary();
        Manager obj2=new Manager("Computer","MCA");
        obj2.print();
        
	}

}
