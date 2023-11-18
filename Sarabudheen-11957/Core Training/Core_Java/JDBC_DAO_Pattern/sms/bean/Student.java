package com.sms.bean;

public class Student {

	private int Id;
	private String Name;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		Id = id;
		Name = name;
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

	public void displayStudent() {
		System.out.println("Student ID is : " + Id);
		System.out.println("Student Name is : " + Name);
		System.out.println("*************************************");
	}

}
