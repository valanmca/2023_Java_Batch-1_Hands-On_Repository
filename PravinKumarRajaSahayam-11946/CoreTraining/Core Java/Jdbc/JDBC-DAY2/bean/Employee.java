package com.ems.bean;
public class Employee {
	private int student_id;
	private String student_name;
	private String student_department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int student_id, String student_name, String student_department) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_department = student_department;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_department() {
		return student_department;
	}

	public void setStudent_department(String student_department) {
		this.student_department = student_department;
	}

	public void display() {
		System.out.println("Employee Id is:" + " " + student_id);
		System.out.println("Employee Name is:" + " " + student_name);
		System.out.println("Employee Department is" + " " + student_department);
		System.out.println("--------------------------------");
	}
}