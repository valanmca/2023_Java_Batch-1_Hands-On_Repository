package com.jeyandhan.assignment;

class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	int getID() {
		return id;
	}

	String getfirstName() {
		return firstName;
	}

	String getlastName() {
		return lastName;
	}

	String getName() {
		String name = firstName + lastName;
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	int getAnnualSalary() {
		int annualSalary = 12 * salary;
		return annualSalary;
	}

	int raiseSalary(int percent) {
		int raiseSalary = ((percent * salary) / 100) + salary;
		return raiseSalary;
	}

	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", getID()=" + getID() + ", getfirstName()=" + getfirstName() + ", getlastName()=" + getlastName()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getAnnualSalary()="
				+ getAnnualSalary() + ", raiseSalary()=" + raiseSalary(2) + "]";
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		Employee obj = new Employee(961, "naga", "jeyandhan", 5000);
		System.out.println(obj.toString());

	}

}
