package com.shaji.Day10;

class Member{
	//Variables
	String Name;
	int Age,phoneNum;
	String Address;
	float salary;
	
	Member(String Name, int Age, int phoneNum, String Address, float salary){
		this.Name=Name;
		this.Age=Age;
		this.phoneNum=phoneNum;
		this.Address=Address;
		this.salary=salary;
	}
}

class Employee2 extends Member{
	String Specialization,Department;
	Employee2(String Name, int Age, int phoneNum, String Address, float salary, String Specialization, String Department){
		super(Name, Age, phoneNum, Address, salary);
		this.Specialization=Specialization;
		this.Department=Department;
		}
	
	void displayEmployee() {
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
		System.out.println("Phone Number : "+phoneNum);
		System.out.println("Address : "+Address);
		System.out.println("Salary : " +salary);
		System.out.println("Specialization : "+Specialization);
		System.out.println("Department : "+Department);
	}
	}

class Manager1 extends Member{
	String Specialization,Department;
	Manager1(String Name, int Age, int phoneNum, String Address, float salary, String Specialization, String Department ){
		super(Name, Age, phoneNum, Address, salary);
		this.Specialization=Specialization;
		this.Department=Department;
	}
	
	void displayManager() {
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
		System.out.println("Phone Number : "+phoneNum);
		System.out.println("Address : "+Address);
		System.out.println("Salary : " +salary);
		System.out.println("Specialization : "+Specialization);
		System.out.println("Department : "+Department);
	}
}

public class Inherite_Ex {

	public static void main(String[] args) {
		
		System.out.println("\n");
		
		Employee2 member = new Employee2("Shaji", 20, 962916916,"1/131-MiddleStreet-Maruthadiyur", 8537.0f, "Java", "Training");
		member.displayEmployee();
		
		System.out.println("\n");
		
		Manager1 member1 = new Manager1("BS24", 24, 962916916,"1/131-MiddleStreet-Maruthadiyur", 16000.0f, "Full Stack", "Trainee");
		member1.displayManager();
		
		

	}

}
