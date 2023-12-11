package com.bean;

public class Patient {
	
	private int Id;
	private String Name;
	private int Age;
	private String Email;
	private String BloodGroup;
	private String Location;
	public Patient() {
		super();
		
	}
	
	public Patient(int id, String name, int age, String email, String bloodGroup, String location) {
		super();
		Id = id;
		Name = name;
		Age = age;
		Email = email;
		BloodGroup = bloodGroup;
		Location = location;
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	

}
