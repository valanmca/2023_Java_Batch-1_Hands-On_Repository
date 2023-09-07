package com.domnic.oopsday3;

class Member {
	String name;
	int age;
	int phno;
	String address;
	int sal;

	Member(String name, int age, int phno, String address, int sal) {
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.address = address;
		this.sal = sal;
	}

	void printSalaray() {
		System.out.println("Salary is :" + sal);
	}
}

class Employee4 extends Member {
	String specialization;
	String department;

	Employee4(String name, int age, int phno, String address, int sal, String specialization, String department) {
		super(name, age, phno, address, sal);
		this.specialization = specialization;
		this.department = department;

	}

	void display() {
		System.out.println("Name           :" + name);
		System.out.println("Age            :" + age);
		System.out.println("phno           :" + phno);
		System.out.println("address        :" + address);
		System.out.println("sal            :" + sal);
		System.out.println("specialization :"+specialization);
		System.out.println("department     :"+department);
	}
}

class Manager extends Member {
	String specialization;
	String department;

	Manager(String name, int age, int phno, String address, int sal,String specialization, String department) {
		super(name, age, phno, address, sal);
		this.specialization = specialization;
		this.department = department;

	}
	void display() {
		System.out.println("Name           :" + name);
		System.out.println("Age            :" + age);
		System.out.println("phno           :" + phno);
		System.out.println("address        :" + address);
		System.out.println("sal            :" + sal);
		System.out.println("specialization :"+specialization);
		System.out.println("department     :"+department);
	}
}

public class InheritAssg {

	public static void main(String[] args) {
		Employee4 obj1 = new Employee4("Domnic", 20, 99876543, "address", 9000,"Trainee","Development");
		obj1.display();
		System.out.println();
		Manager obj2 = new Manager("Sara", 20, 90675543, "address", 10000,"Manager","Hr");
		obj2.display();
	}

}
