package com.ems.bean;

public class Employee {
	private int emp_id;
	private String ename;
	private int salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int emp_id, String ename, int salary) {
		super();
		this.emp_id = emp_id;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
