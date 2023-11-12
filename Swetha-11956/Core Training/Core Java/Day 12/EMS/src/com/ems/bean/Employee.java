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
	public void display() {
		System.out.println("Employee ID : "+ id);
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Salary : "+ salary);
		System.out.println("Employee Dno : "+ dno);
		System.out.println("------------------------");
	}



	public static void main(String[] args) {

		
	}

}