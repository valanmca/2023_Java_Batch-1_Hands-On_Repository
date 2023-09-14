package com.jeban.OOPsday3;//super class with sub classes

class Member {
	String Name;
	int Age;
	int PhoneNumber;
	String Address;
	int Salary;

	Member(String Name, int Age, int PhoneNumber, String Address, int Salary) {
		this.Name = Name;
		this.Age = Age;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
		this.Salary = Salary;
	}

	void printsalary() {

		System.out.println("Salary:" + Salary);
	}
}

class Employee3 extends Member {
	String Specialization;
	String Department;

	Employee3(String Name, int Age, int PhoneNumber, String Address, int Salary,String Specialization, String Department) {
		super("Jeban", 23, 82480931, "PDKT", 20000);
		this.Specialization = Specialization;
		this.Department = Department;
	}

	void display() {
		System.out.println("Name:" + Name);
		System.out.println("Age:" + Age);
		System.out.println("Pno:" + PhoneNumber);
		System.out.println("Address:" + Address);
		System.out.println("Salary:" + Salary);
		System.out.println("Ds:"+Specialization);
		System.out.println("Department:"+Department);

	}

}

class Manager extends Member {
	String Specialization;
	String Department;

	Manager(String Name, int Age, int PhoneNumber, String Address, int Salary,String Specialization, String Department) {
		super("Jeban", 23, 82480931, "PDKT", 20000);
		this.Specialization = Specialization;
		this.Department = Department;

	}

	void display() {
		System.out.println("Name:" + Name);
		System.out.println("Age:" + Age);
		System.out.println("Pno:" + PhoneNumber);
		System.out.println("Address:" + Address);
		System.out.println("Salary:" + Salary);
		System.out.println("Speilization:"+Specialization);
		System.out.println("Department:"+Department);
	}
}

public class inheritance5 {

	public static void main(String[] args) {
		Member obj = new Member("jeban", 22, 897654566, "Pdkt", 10000);
		obj.printsalary();
		
		System.out.println(" ");
		
		Employee3 obj1=new Employee3("Domnic",23,6787877,"PDKT",20000,"Ds", "DATA SCIENCE");
		obj1.display();
		
		System.out.println(" ");

		Manager obj2 = new Manager("Jeban",23,6787877,"PDKT",20000,"Ds", "DATA SCIENCE");
		obj2.display();
		
		

	}

}
