package com.jeban;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private Address address;
	private List<String> placevisited;
	private Map<Integer, String> department;
	private Set<Integer> experience;

	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary, Address address, List<String> placevisited,
			Map<Integer, String> department, Set<Integer> experience) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.placevisited = placevisited;
		this.department = department;
		this.experience = experience;
	}

	public Set<Integer> getExperience() {
		return experience;
	}

	public void setExperience(Set<Integer> experience) {
		this.experience = experience;
	}

	public Map<Integer, String> getDepartment() {
		return department;
	}

	public void setDepartment(Map<Integer, String> department) {
		this.department = department;
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

	public List<String> getPlacevisited() {
		return placevisited;
	}

	public void setPlacevisited(List<String> placevisited) {
		this.placevisited = placevisited;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", placevisited=" + placevisited + ", department=" + department + ", experience=" + experience + "]";
	}

	public void show() {
		System.out.println("Employee Id:" + id);
		System.out.println("Employee Name:" + name);
		System.out.println("Empoyee Salary:" + salary);
		System.out.println("Address:" + address.toString());
		System.out.println("Place Visited:"+placevisited);
		System.out.println("Department:"+department);
		System.out.println("Experience:"+experience);
	}

}
