//Java Bean (Getter and setter)

package com.jeyandhan.day12;

public class Employee {

	private int eId;
	private String eName;
	private float eSalary;
	
	public Employee(int eId, String eName, float eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float geteSalary() {
		return eSalary;
	}

	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}


	public void display() {
		System.out.println("Employee Id: " + eId);
		System.out.println("Employee Name: " + eName);
		System.out.println("Employee Salary: " + eSalary);
	}

	public static void main(String[] args) {
		Employee jeyandhan = new Employee(11961, "Jeyandhan", 5000.0f);

		jeyandhan.display();

		jeyandhan.seteSalary(10000.0f);
		System.out.println("\n"+jeyandhan.geteId());
		System.out.println(jeyandhan.geteName());
		System.out.println(jeyandhan.geteSalary());
		
	}

}
