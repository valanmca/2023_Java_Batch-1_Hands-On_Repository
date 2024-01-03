package com.swetha;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private List<String> placeVisited;
	private Set<String> knownLang;
	private Map<Integer,String>countries; 
	private Properties props;
	private EmpAddress address; //Declaring reference for EmpAddress
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Employee(int id, String name, int salary, List<String> placeVisited, Set<String> knownLang,
			Map<Integer, String> countries,Properties props,EmpAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.placeVisited = placeVisited;
		this.knownLang = knownLang;
		this.countries = countries;
		this.props=props;
		this.address = address;
	}




	public Properties getProps() {
		return props;
	}




	public void setProps(Properties props) {
		this.props = props;
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




	public List<String> getPlaceVisited() {
		return placeVisited;
	}




	public void setPlaceVisited(List<String> placeVisited) {
		this.placeVisited = placeVisited;
	}




	public Set<String> getKnownLang() {
		return knownLang;
	}




	public void setKnownLang(Set<String> knownLang) {
		this.knownLang = knownLang;
	}




	public Map<Integer, String> getCountries() {
		return countries;
	}




	public void setCountries(Map<Integer, String> countries) {
		this.countries = countries;
	}




	public EmpAddress getAddress() {
		return address;
	}




	public void setAddress(EmpAddress address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", placeVisited=" + placeVisited
				+ ", knownLang=" + knownLang + ", countries=" + countries + ", props=" + props + ", address=" + address
				+ "]";
	}




	



	
	
	
	
	
	
	
	
	

}
