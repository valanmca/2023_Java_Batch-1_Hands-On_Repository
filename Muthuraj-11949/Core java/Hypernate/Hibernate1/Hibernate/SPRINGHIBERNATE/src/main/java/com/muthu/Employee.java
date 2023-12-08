package com.muthu;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
public class Employee {
	private int id;
	private String name;
	private int salary;
	private List<String> plcaesVister;
    private Map<String, String> phoneNos;
	private Address address;
	private TreeSet <String> positiion;
	public Employee() {
		super();
	}			
	public Employee(String name,int id, int salary, List<String> plcaesVister, Map<String, String> phoneNos,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.plcaesVister = plcaesVister;
		this.phoneNos = phoneNos;
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
	
	public List<String> getPlcaesVister() {
		return plcaesVister;
	}
	public void setPlcaesVister(List<String> plcaesVister) {
		this.plcaesVister = plcaesVister;
	}
	
	public Map<String, String> getPhoneNos() {
		return phoneNos;
	}

	public void setPhoneNos(Map<String, String> phoneNos) {
		this.phoneNos = phoneNos;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", plcaesVister=" + plcaesVister
				+ ", phoneNos=" + phoneNos + ", address=" + address + "]";
	}	
}
