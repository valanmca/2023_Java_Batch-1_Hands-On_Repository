package com.day1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private Address address;
	private List<String> placeVisited;
	private Map<Integer,String> project;
	private Set<String> phNo;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary, Address address, List<String> placeVisited,
			Map<Integer, String> project, Set<String> phNo) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.placeVisited = placeVisited;
		this.project = project;
		this.phNo = phNo;
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
	
	public List<String> getPlaceVisited() {
		return placeVisited;
	}

	public void setPlaceVisited(List<String> placeVisited) {
		this.placeVisited = placeVisited;
	}

	public Map<Integer, String> getProject() {
		return project;
	}

	public void setProject(Map<Integer, String> project) {
		this.project = project;
	}

	public Set<String> getPhNo() {
		return phNo;
	}

	public void setPhNo(Set<String> phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", placeVisited=" + placeVisited + ", project:" + project + ", phNo=" + phNo + "]";
	}

	

    
	
	
	
	
	
	

}
