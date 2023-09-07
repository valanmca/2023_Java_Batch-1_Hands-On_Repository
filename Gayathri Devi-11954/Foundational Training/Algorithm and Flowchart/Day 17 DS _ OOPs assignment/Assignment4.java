package com.gayathri.assignment;

class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;

	Employee(int id, String firstname, String lastname, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		String name = firstname + " " + lastname;
		return name;
	}

	public int getannualSalary() {
		int annualsalary = salary * 12;
		return annualsalary;
	}

	public int raisesalary(int percent) {
		int per = (getSalary() * percent) / 100;
		int raisesalary = getSalary() + per;
		return raisesalary;
	}

	public String toString() {
		return "Employee [id=" + getId() + ", " + "name=" + getName() + ", " + " salary=" + raisesalary(30) + "]";
	}

	void display() {
		System.out.println("The detail are : " + toString());
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Employee obj = new Employee(101, "Gayathri", "Devi", 10000);
		obj.getName();
		obj.display();
//		obj.getannualSalary();
//		obj.raisesalary(20);
	}

}
