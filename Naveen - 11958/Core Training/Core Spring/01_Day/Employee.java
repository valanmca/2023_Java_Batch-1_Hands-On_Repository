package com.naveen;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private List<String> placesVisited;
	private Map<String, String> map;
	private Set<String> qualification;
	private Address address;

	public Employee(int id, String name, int salary, List<String> placesVisited, Map<String, String> map,
			Set<String> qualification, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.placesVisited = placesVisited;
		this.map = map;
		this.qualification = qualification;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getQualification() {
		return qualification;
	}

	public void setQualification(Set<String> qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placesVisited=" + placesVisited
				+ ", map=" + map + ", qualification=" + qualification + "]";
	}

	

//	public void display() {
//		System.out.println("Employee Id: " + id);
//		System.out.println("Employee Name: " + name);
//		System.out.println("Employee Salary: " + salary);
//	}

}
