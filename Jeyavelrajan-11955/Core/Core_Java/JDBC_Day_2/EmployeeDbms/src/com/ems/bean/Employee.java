package com.ems.bean;

public class Employee {
	private int Id;
	private String Name;
	private int Salary;
	private int Dno;
	
	
	public Employee() {
		super();
		
	}
	
	
	public Employee(int Id, String Name, int Salary, int Dno) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
		this.Dno = Dno;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getDno() {
		return Dno;
	}
	public void setDno(int dno) {
		Dno = dno;
	}



	public void display() {
		System.out.println("Employee Id"+Id);
		System.out.println("Employee Name"+Name);
		System.out.println("Employee Salary"+Salary);
		System.out.println("Employee Dno"+Dno);
		
	}
	
	

	
	
}
