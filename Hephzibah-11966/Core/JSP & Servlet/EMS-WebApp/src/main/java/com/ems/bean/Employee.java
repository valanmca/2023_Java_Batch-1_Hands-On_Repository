package com.ems.bean;

public class Employee {
	private int id;
	private String ename;
	private int salary;
	private int depno;

	public Employee() {
		super();

	}

	public Employee(int id, String ename, int salary, int depno) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
		this.depno = depno;
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

	public int getDepno() {
		return depno;
	}

	public void setDepno(int depno) {
		this.depno = depno;
	}

}