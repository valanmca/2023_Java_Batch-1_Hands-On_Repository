package com.practice;

import java.util.List;
import java.util.Map;

public class Book {
	private int id;
	private Address address;
	private Map<String,String> map;
	private List<String> coll;
	
	

	public Book() {
		super();
	}
	
	public Book(int id, Address address, Map<String, String> map,List<String> coll) {
		super();
		this.id = id;
		this.address = address;
		this.map = map;
		this.coll = coll;
	}

	public List<String> getColl() {
		return coll;
	}

	public void setColl(List<String> coll) {
		this.coll = coll;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", address=" + address + ", map=" + map + ", coll=" + coll + "]";
	}

	

	

		

}
