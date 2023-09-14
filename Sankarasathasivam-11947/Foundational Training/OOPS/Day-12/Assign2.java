package com.shiva.day12;

//coding standard java bean

class Employee01 {
	private int eId;
	private String eName;
	private float eSalary;

	public Employee01(int eId, String eName, float eSalary) {
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

	void display()
	{
		System.out.println("Employee Id : "+eId);
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Salary : "+eSalary);
	}
}

public class Assign2 {

	public static void main(String[] args) {

		Employee01 employee = new Employee01(11947, "Shiva", 200.0f);
		employee.display();
		employee.seteSalary(10000);
		System.out.println(employee.geteSalary());
	}

}
