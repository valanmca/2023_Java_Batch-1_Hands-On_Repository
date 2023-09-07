package com.dharshu.ass;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		String name = getFirstName() + " " + getLastName();
		return name;
	}

	public int getAnnualSalary() {
		int annualsalary = getSalary() * 12;
		return annualsalary;
	}

	public double raiseSalary(int percent) {
		double raisedsalary = ((getSalary() * (percent * 0.01)) + getSalary());
		return raisedsalary;
	}

	public String toString() {
		String detail = "Empid = " + getId() + " , firstName=  " + getFirstName() + " , LastName = " + getLastName()
				+ " , Salary =  " + getSalary();
		return detail;
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		Employee obj = new Employee(11953, "Dharshu", "Alagar", 20000);
		System.out.println("Id             :  " + obj.getId());
		System.out.println("First Name     :  " + obj.getFirstName());
		System.out.println("Last Name      :  " + obj.getLastName());
		System.out.println("Full Name      :  " + obj.getName());
		System.out.println("Salary         :  " + obj.getSalary());
		System.out.println("Annual Salary  :  " + obj.getAnnualSalary());
		System.out.println("Raised Salary  :  " + obj.raiseSalary(15));
		System.out.println(obj.toString());

	}

}
