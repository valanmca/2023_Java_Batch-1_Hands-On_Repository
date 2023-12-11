package com.spring.day01;

import java.util.List;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private List<String> placesVisited;
	private Address address;
	private Map<String, String> phoneNo;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary, List<String> placesVisited, Address address,
			Map<String, String> phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.placesVisited = placesVisited;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
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

	public List<String> getPlacesVisited() {
		return placesVisited;
	}

	public void setPlacesVisited(List<String> placesVisited) {
		this.placesVisited = placesVisited;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Map<String, String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Map<String, String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placesVisited=" + placesVisited
				+ ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}

}
