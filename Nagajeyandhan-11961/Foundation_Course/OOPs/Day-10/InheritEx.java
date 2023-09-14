//Employee and Manager details

package com.jeyandhan.day10;

class Member { // super class
	// variables
	String name, Address;
	int age;
	int phoneNumber;
	float salary;

	Member(String name, int age, int phoneNumber, String Address, float salary) { // constructor
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.Address = Address;
		this.salary = salary;

	}

	float printSalary() { // method
		return salary;
	}
}

class Employ extends Member { // subclass of member
	String Specialization, Department; // variables

	Employ(String name, int age, int phoneNumber, String Address, float salary, String Specialization,
			String Department) { // constructor
		super(name, age, phoneNumber, Address, salary); // super keyword to call super class constructor
		this.Specialization = Specialization; // initialize value
		this.Department = Department;

	}

	void disp() { // display method
		System.out.println("\n\t *****Employee Details*****");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Address: " + Address);
		System.out.println("Salary: " + printSalary());
		System.out.println("Specialization: " + Specialization);
		System.out.println("Department: " + Department);
	}

}

class Manager extends Member { // sub class of member
	String Specialization, Department; // variables

	Manager(String name, int age, int phoneNumber, String Address, float salary, String Specialization,
			String Department) { // constructor
		super(name, age, phoneNumber, Address, salary);
		this.Specialization = Specialization;
		this.Department = Department;

	}

	void display() {
		System.out.println("\n\t *****Manager Details*****");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Address: " + Address);
		System.out.println("Salary: " + printSalary());

		System.out.println("Specialization: " + Specialization);
		System.out.println("Department: " + Department);
	}

}

public class InheritEx {

	public static void main(String[] args) {

		// object creation
		Employ obj = new Employ("Jeyandhan", 22, 638336617, "M.R.Nagar street, Rajapalayam", 8000.0f, "Java",
				"Trainee");

		Manager obj1 = new Manager("Naga", 32, 638336615, "R.R.Nagar, Chennai", 50000.0f, "Java", "Developer");

		// method calling
		obj.disp();

		obj1.display();

	}

}
