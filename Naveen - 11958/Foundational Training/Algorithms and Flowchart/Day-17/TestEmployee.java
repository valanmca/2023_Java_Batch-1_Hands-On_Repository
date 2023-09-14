package com.naveen.day17;

class Employee {
	private String name;
	private String employeeID;
	private double salary;

	public Employee(String name, String employeeID, double aSalary) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		salary = aSalary;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double aSalary) {
		salary = aSalary;
	}

	@Override
	public String toString() {
		return "Name : " + name + " Employee ID : " + employeeID + ", Salary : $" + salary;
	}

}

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee("Uday", "U-123", 12000);
		System.out.println(e);
		e.setSalary(15000);
		System.out.println(e);

		
	}
}