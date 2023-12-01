package com.dharshu;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
    private String name;
    private int salary;
    private List<String> placesVisited;
    private Map<String, String> map;
    private Set <String> pincode;
    private Address address;
    
    
	public Employee(int id, String name, int salary, List<String> placesVisited, Map<String, String> map,
			Set<String> pincode, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.placesVisited = placesVisited;
		this.map = map;
		this.pincode = pincode;
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
	public Set<String> getPincode() {
		return pincode;
	}
	public void setPincode(Set<String> pincode) {
		this.pincode = pincode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placesVisited=" + placesVisited
				+ ", map=" + map + ", pincode=" + pincode + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
}
