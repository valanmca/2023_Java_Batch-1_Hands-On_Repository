package com.spring;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
private int id;
private String name;
private int salary;
private List<String> placesVisited;
private Map<String,String> map;
private Set<String> education;

@Autowired
private Address address;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, int salary , Address address , List<String> placesVisited , Map<String,String> map , Set<String> education) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.address = address;
	this.placesVisited = placesVisited;
	this.map = map;
	this.education = education;
}

public Set<String> getEducation() {
	return education;
}

public void setEducation(Set<String> education) {
	this.education = education;
}

public Map<String, String> getMap() {
	return map;
}

public void setMap(Map<String, String> map) {
	this.map = map;
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
/*public void display()
{
	System.out.println("Employee Id : " + id);
	System.out.println("Employee Name : " + name);
	System.out.println("Employee Salary : " + salary);
}*/

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placesVisited=" + placesVisited
			+ ", map=" + map + ", education=" + education + ", address=" + address + "]";
}

/*@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placesVisited=" + placesVisited
			+ ", map=" + map + ", address=" + address + "]";
}*/

/*@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placesVisited=" + placesVisited
			+ ", address=" + address + "]";
}*/

/*@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
}*/

/*@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}*/


}
