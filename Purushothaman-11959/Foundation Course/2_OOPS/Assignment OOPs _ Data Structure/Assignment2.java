package com.purushoth.Assignment;

class Employee{
	int id;
	String firstName;
	String lastName;
	int salary;
	
	Employee(int id,String firstName,String lastName,int salary){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
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
	
	public int getAnnualSalary() {
		int annualSalary=salary*12;
		return annualSalary;	
	}
	
	public double raiseSalary(int percent) {
		double raiseSalary=(((percent*salary)/100)+salary);
		return raiseSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getAnnualSalary()="
				+ getAnnualSalary() + "]";
	}
	
	
}
public class Assignment2 {

	public static void main(String[] args) {
		Employee obj=new Employee(122,"Suresh","Kumar",20000);
		System.out.println(obj.raiseSalary(7));
		System.out.println(obj.toString());
	}

}
