package com.madhan;

import java.util.List;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private Address address;
	private List<String> placesVisited;
	private Map<Integer, String> skills;

	public Employee() {
		super();
		
	}

	public Employee(int id, String name, int salary, Address address, List<String> placesVisited,
			Map<Integer, String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.placesVisited = placesVisited;
		this.skills = skills;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getPlacesVisited() {
		return placesVisited;
	}

	public void setPlacesVisited(List<String> placesVisited) {
		this.placesVisited = placesVisited;
	}

	public Map<Integer, String> getSkills() {
		return skills;
	}

	public void setSkills(Map<Integer, String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", placesVisited=" + placesVisited + ", skills=" + skills + "]";
	}

}
