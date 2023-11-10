package com.ems.bean;

public class Employee {
	private int id;
	private String ename;
	private int salary;
	private int dno;

	
	public Employee() {
		super();
		
	}

	public Employee(int id, String ename, int salary, int dno) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
		this.dno = dno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public void display() {
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Employee dept no:"+dno);
	}

}
