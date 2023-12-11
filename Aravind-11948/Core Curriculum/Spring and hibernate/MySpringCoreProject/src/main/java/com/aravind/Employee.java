
package com.aravind;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private Address address;
   private List<String> placevisited;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int id, String name, int salary, Address address, List<String> placevisited) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.placevisited = placevisited;
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
				+ ", placevisited=" + placevisited + "]";
	}



	void show()
	{
		System.out.println("Emp Id:"+id);
		System.out.println("Emp Name:"+name);
		System.out.println("Emp Salary:"+salary);
		System.out.println("Address :"+address.toString());
	}

	
	
}
