package com.Matthew;

import java.util.List;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private Map<String ,String> map;
	

public Employee(int id, String name, int salary, Map<String, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.map = map;
	}


//	private List<String> placeVisited;
	
	
//	public List<String> getPlaceVisited() {
//		return placeVisited;
//	}
//	public void setPlaceVisited(List<String> placeVisited) {
//		this.placeVisited = placeVisited;
//	}
	
	public Map<String, String> getMap() {
	return map;
}


public void setMap(Map<String, String> map) {
	this.map = map;
}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	public Employee(int id, String name, int salary, List<String> placeVisited) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.placeVisited = placeVisited;
//	}
	
	
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
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placeVisited=" + placeVisited + "]";
//	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", map=" + map + "]";
	}

	
//	public void display() {
//		System.out.println("Employee Id : "+ id);
//		System.out.println("Employee Name : "+name);
//		System.out.println("Employee Salary : "+salary);
//		System.out.println("Address : "+address.toString());
//		
//	}
	
}
