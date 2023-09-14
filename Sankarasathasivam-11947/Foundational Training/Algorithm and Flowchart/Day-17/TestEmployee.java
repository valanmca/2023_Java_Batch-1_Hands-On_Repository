package com.shiva.day17;

class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private int Salary;
	public int annualSalary;
	public int raiseSalary;

	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Salary = salary;
		
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

	public void setSalary(int salary) {
		Salary = salary;
	}


	public void annualSalary() {
		int annualSalary = Salary*12;
		System.out.println(annualSalary);
	}
	

	public void raiseSalary(){
		int Salary1=20000;
		int raiseSalary = (Salary/Salary1)*100;
		System.out.println(raiseSalary);
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(Salary);
//		System.out.println(annualSalary);
//		System.out.println(raiseSalary);
	}
//	public void AnnualSalary(int annualSalary) {
//		this.annualSalary = annualSalary*12;
//		System.out.println(annualSalary);
//	}
//
//	public void RaiseSalary(int raiseSalary) {
//		this.raiseSalary = (raiseSalary/15)*100;
//		System.out.println(raiseSalary);
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Salary=" + Salary
				+ ", annualSalary=" + annualSalary + ", raiseSalary=" + raiseSalary + "]";
	}
	
	
}
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp=new Employee(11947,"Sankarasathasivam","Muthukrishnan",15000);
		emp.display();
		
		emp.annualSalary();
		emp.raiseSalary();
	}

}
