package com.matthew.day10;

class Member{
	String name;
	int age;
	int phNo;
	String address;
	float salary;
	
	Member(String name,int age, int phNo,String address,float salary){
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.address = address;
		this.salary = salary;
	}
	void printSalary() {
		System.out.println("Salary:"+salary);
	}
	
}

class Employee3 extends Member{
	String specialization ;
	String department;
	Employee3(String name, int age, int phNo, String address, float salary,String specialization,String department) {
		super(name, age, phNo, address, salary);
		this.specialization = specialization;
		this.department = department;
	}
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("PhNo: " + phNo);
		System.out.println("Address : " + address);
		System.out.println("Salary: " + salary);
		System.out.println("Specialization: " + specialization);
		System.out.println("Department: " + department);
	}
	
}

class Manager extends Employee3{
//	String specialization ;
//	String department;
	Manager(String name, int age, int phNo, String address, float salary,String specialization,String department) {
		super(name, age, phNo, address, salary,specialization,department);
//		this.specialization = specialization;
//		this.department = department;
	}
	
}
public class Assessment {

	public static void main(String[] args) {
		Manager Matthew = new Manager("Matthew",21,637949655,"Tenkasi",14900.23f,"MBA","HR");
		Matthew.display();
		System.out.println("----------------------------------------------------");
		Employee3 Barath = new Employee3("Barath",20,563276475,"Madurai",10000.213f,"Developer","Java");
		Barath.display();
	}

}
