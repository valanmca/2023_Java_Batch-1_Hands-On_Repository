package com.naveen.day4;
/*2. Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. 
 * In each subclass,override the calculateSalary() method to calculate and return the salary based on their specific roles.*/
class Employee{
	String name;
	String role;
	
	Employee(String name, String role){
		this.name = name;
		this.role = role;
	}
	public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public float calculateSalary() {
        return 0;
    }
}

class Manager extends Employee{
	float baseSalary, bonus;
	
	Manager(String name, float baseSalary, float bonus){
		super(name, "Manager");
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	
	public float calculateSalary() {
		return baseSalary + bonus;
	}
	
}

class Programmer extends Employee{
	float baseSalary, overTimePay;
	
	Programmer(String name, float baseSalary, float overTimePay){
		super(name, "Programmer");
		this.baseSalary = baseSalary;
		this.overTimePay = overTimePay;
	}
	
	public float calculateSalary() {
		return baseSalary + overTimePay;
	}
	
}
public class Ex07_Employee {

	public static void main(String[] args) {
		
		Employee obj1 = new Manager("Naveen",45000.0f, 12000.0f);
		Employee obj2 = new Programmer("Jenish",25000.0f, 5000.0f);
		
		System.out.println("Manager: " + obj1.getName() + "\nRole: " + obj1.getRole() + "\nSalary: $" + obj1.calculateSalary());
        System.out.println("\nProgrammer: " + obj2.getName() + "\nRole: " + obj2.getRole() + "\nSalary: $" + obj2.calculateSalary());
		
		
	}

}
