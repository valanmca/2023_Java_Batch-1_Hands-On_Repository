package com.jenish.day12;

class Employee1 {
	private int  eid;
	private String ename;
	private float esalary;
	
	
	public Employee1(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public float getEsalary() {
		return esalary;
	}


	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	void display() {
		System.out.println("Employee Id : " +eid);
		System.out.println("Employee Name : " +ename);
		System.out.println("Employee Salary : " +esalary);
}
	

public class JavaBean_Ex1 {

	public static void main(String[] args) {
		Employee1 jenish = new Employee1(111, "Jeni",2000);
		jenish.display();
		jenish.setEid(111);
		jenish.getEid();
		
		
		

	}

}
}