package com.domnic.assignment;

//Assg2_15_7_23
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
    public String getName() {
    	String name=firstName+lastName;
    	return name;
    }
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int annualSalary() {
		int annualsalary=salary*12;
		return annualsalary;
	}
	public double raiseSalary(int percent) {
		int raiseSalary=((percent*salary)/100)+salary;
		
		return raiseSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", annualSalary()=" + annualSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}

public class TestEmployee {

	public static void main(String[] args) {
     Employee obj=new Employee(11964, "Domnic", "Dev", 20000);
 	System.out.println(obj.toString());
 	
 	System.out.println("New Salary = "+obj.raiseSalary(2));
	}

}
