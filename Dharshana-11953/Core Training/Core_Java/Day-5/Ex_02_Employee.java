package com.dharshu.day5;

class Employee {
	String empName;
	String empRole;
	
	Employee(String empName, String empRole) {
		this.empName = empName;
		this.empRole = empRole;
	}
	String getName() {
		return empName;
	}
	String getRole() {
		return empRole;
	}
	double calculateSalary() {
		return 0.0;
	}
}
class Manager extends Employee {
	double baseSalary;
	double bonus;
	
	Manager(String empName, double baseSalary, double bonus) {
		super(empName, "Manager");
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	double calculateSalary() {
		return baseSalary + bonus;
	}
}
class Programmer extends Employee {
	double baseSalary;
	double overtimePay;
	
	Programmer(String empName, double baseSalary, double bonus) {
		super(empName, "Programmer");
		this.baseSalary = baseSalary;
		this.overtimePay = overtimePay;
	}
	double calculateSalary() {
		return baseSalary + overtimePay;
	}
}


public class Ex_02_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Manager("Dharshu", 1200.0, 3500.0);
		Employee emp2 = new Programmer("Minion", 1300.0, 4500.0);
		
		System.out.println("Manager:" +emp1.getName() +"\nRole:" +emp1.getRole() +"\nSalary:" +emp1.calculateSalary());
		System.out.println("Programmer:" +emp2.getName() +"\nRole:" +emp2.getRole() +"\nSalary:" +emp2.calculateSalary());


	}

}
