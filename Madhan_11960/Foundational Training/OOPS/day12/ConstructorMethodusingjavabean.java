package com.madhan.day12;

class Employee1 {
	private int empid;
	private String ename;
	private int empsalary;

	public Employee1(int empid, String ename, int empsalary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.empsalary = empsalary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	public void display() {
		System.out.println("Employee Id:" + empid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee Salary:" + empsalary);
	}

}

public class ConstructorMethodusingjavabean {

	public static void main(String[] args) {
		Employee1 emp = new Employee1(11960, "Madhan", 50000);
		emp.display();
		emp.setEmpsalary(20000);
		System.out.println("Updated salary:"+ emp.getEmpsalary());
		
	}

}
