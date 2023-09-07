package com.swetha.day10;
class Member{
	String Name;
	int Age;
	int PhoneNo;
	String Address;
	int Salary;
	
	Member(String Name,int Age,int PhoneNo,String Address,int Salary){
		this.Name = Name;
		this.Age=Age;
		this.PhoneNo=PhoneNo;
		this.Address=Address;
		this.Salary=Salary;
	}

	void PrintSalary() {
		System.out.println("Salary" +Salary);
	}
	
	
}
class Employee extends Member{
	String special;
	String dept;
	Employee(String Name,int Age,int PhoneNo,String Address,int Salary,String special,String dept){
		super(Name,Age,PhoneNo,Address,Salary);
		this.special=special;
	    this.dept=dept;
	}
	void display() {
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
		System.out.println("PhoneNo : "+PhoneNo);
		System.out.println("Address : "+Address);
		System.out.println("Salary : "+Salary);
		System.out.println("Specialization :"+special);
		System.out.println("Department : "+dept);
	}
	
	
}
class Manager extends Member{
	String special;
	String dept;
	Manager(String Name,int Age,int PhoneNo,String Address,int Salary,String special,String dept){
		super(Name,Age,PhoneNo,Address,Salary);
		this.special=special;
		this.dept=dept;
	}
	void display() {
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
		System.out.println("PhoneNo : "+PhoneNo);
		System.out.println("Address : "+Address);
		System.out.println("Salary : "+Salary);
		System.out.println("Specialization :"+special);
		System.out.println("Department : "+dept);
	}
	
}
public class EmpDetailsInheritance {

	public static void main(String[] args) {
		Employee obj=new Employee("Swetha",21,97788603,"Villupuram",40000,"Trainee","Cse");
		
		obj.display();

	}

}
