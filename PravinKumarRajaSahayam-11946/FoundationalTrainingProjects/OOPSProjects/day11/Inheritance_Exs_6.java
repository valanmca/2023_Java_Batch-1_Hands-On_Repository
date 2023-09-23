
package com.pravinkumar.day11;

//Using Inheritance Methods
class Member {
	String Name;
	int Age;
	int PhoneNumber;
	String Address;
	float Salary;

	Member(String Name, int Age, int PhoneNumber, String Address, float Salary) {
		this.Name = Name;
		this.Age = Age;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
		this.Salary = Salary;
	}

	void printSalary() {
		System.out.println("The Salary is : " + Salary);
	}
}

class Manager0 extends Member {
	// Variables

	String Specification;
	String Department;

	// Constructors
	Manager0(String Name, int Age, int PhoneNumber, String Address, float Salary, String Specification,
			String Department) {
		super(Name, Age, PhoneNumber, Address, Salary);
		this.Specification = "B.E";
		this.Department = "CSE";

	}

	void Manager0() {
		System.out.println("The Specification is : " + Specification);
		System.out.println("The Department is : " + Department);
		System.out.println("The Name is : " + Name);
		System.out.println("The Age is : " + Age);
		System.out.println("The PhoneNumber is : " + PhoneNumber);
		System.out.println("The Address is : " + Address);
		System.out.println("The Salary is : " + Salary);
	}
}

class Employee0 extends Manager0 {
	Employee0(String Name, int Age, int PhoneNumber, String Address, int Salary, String Specification,
			String Department) {
		super(Name, Age, PhoneNumber, Address, Salary, Specification, Department);
		this.Specification = "B.E";
		this.Department = "ECE";
		// TODO Auto-generated constructor stub
	}

	void Employee0() {
		System.out.println("The Specification is : " + Specification);
		System.out.println("The Department is : " + Department);
		System.out.println("The Name is : " + Name);
		System.out.println("The Age is : " + Age);
		System.out.println("The PhoneNumber is : " + PhoneNumber);
		System.out.println("The Address is : " + Address);
		System.out.println("The Salary is : " + Salary);
	}
}

public class Inheritance_Exs_6 {

	private static final char[] Employee0 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee0 obj = new Employee0("PravinKumar", 19, 63999, "s", 100000, "B.E", "CSE");
		obj.Employee0();
		obj.Manager0();
	    obj.printSalary();

	}

}
