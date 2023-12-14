package com.vms.bean;

public class Vehicle {
	private int id;
	private String name;
	private int no;
	String owner;
	
	
	public Vehicle(int id, String name, int no, String owner) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
		this.owner = owner;
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
