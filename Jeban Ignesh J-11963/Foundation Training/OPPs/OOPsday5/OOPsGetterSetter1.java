package com.jeban.OOPsday5;//GETTER AND SETTER METHOD

class Employee {
	private int eId;
	private String eName;
	private int eSalary;

	public Employee(int eId, String eName, int eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	void display() {
		System.out.println("Employee Name:" + eId);
		System.out.println("Employee Name:" + eName);
		System.out.println("Employee Salary:" + eSalary);
	}

}

public class OOPsGetterSetter1 {

	public static void main(String[] args) {

		Employee obj = new Employee(101, "Jeban", 2000);
		obj.display();

		System.out.println(" ");

		obj.seteSalary(200000);
		obj.display();

		System.out.println(" ");

		obj.geteSalary();
		obj.display();

	}

}
