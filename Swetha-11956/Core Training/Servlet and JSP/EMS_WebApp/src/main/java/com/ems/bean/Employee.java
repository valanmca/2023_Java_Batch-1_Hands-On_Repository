package com.ems.bean;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private int dno;
	
	

	public int getId() {
		return id;
	}



	public Employee(int id, String name, int salary, int dno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dno = dno;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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
	


	public static void main(String[] args) {

		
	}

}
