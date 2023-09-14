package com.sara.assignments;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return lastName;
	}

	public String getName() {
		String name = firstName + lastName;
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		int annualSalary = salary * 12;
		return annualSalary;
	}

	public double raiseSalary(int percent) {
		double raiseSalary = (((percent * salary) / 100) + salary);
		return raiseSalary;
	}

	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ",  Name =" + getName() + ", AnnualSalary =" + getAnnualSalary() + "]";
	}

}

public class Assignment_02 {

	public static void main(String[] args) {
		Employee jaban = new Employee(101, "Jaban", "Ignesh", 100000);
		System.out.println(jaban.toString());
		System.out.println(jaban.raiseSalary(50));

	}

}
