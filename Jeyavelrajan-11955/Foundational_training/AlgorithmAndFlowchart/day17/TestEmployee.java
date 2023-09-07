package com.jeyavel.Assignment;

class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int Salary;
	
	Employee(int id,String lastName, String firstName, int Salary ){
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		this.Salary=Salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Salary=" + Salary
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
		return Salary;
	}


	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	
	
	
  public int AnnualSalary(int Salary) {
     int annualSalary=Salary*12;
     
     return annualSalary;
}
  
  
  public String getName( ) {
	  String name = firstName+lastName;
	  return name;
	  
  }
  
  public double raiseSalary(int percent) {
	  double raiseSalary=((percent*Salary)/100)+Salary;
	return raiseSalary;
	  
  }



 
}

public class TestEmployee {

	public static void main(String[] args) {
	 Employee emp = new Employee(11955,"rajan","jeyavel",25000);

	 System.out.println(emp.toString());
	 System.out.println("Raised Salary of an Employee is :->"+emp.raiseSalary(7));
	 	
	 

	}

}

