package com.sara.CoreSpring;

import java.util.List;
import java.util.Map;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private List<String> placesVisited;
	private Map<Integer, String> map;
	private Address address; // agression

	public Employee() {
		super();
	}

	public Employee(int id, String name, int salary, List<String> placesVisited, Map<Integer, String> map,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.placesVisited = placesVisited;
		this.map = map;
		this.address = address;
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


	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee Data \n Employee Id : " + id + "\n Employee Name : " + name + "\n Employee Salary : " + salary
				+ "\n Places Visited : " + placesVisited + "\n Map : " + map + "\n Employee Address : "
				+ address;
	}

}
