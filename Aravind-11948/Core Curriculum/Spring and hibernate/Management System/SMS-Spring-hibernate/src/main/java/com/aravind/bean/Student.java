package com.aravind.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tbl_students")
public class Student {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dep")
	private String dep;
	
	@Column(name="fees")
	private Float fees;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, String dep, Float fees) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.fees = fees;
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


	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}


	public Float getFees() {
		return fees;
	}


	public void setFees(Float fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dep=" + dep + ", fees=" + fees + "]";
	}
	
	
	
	

}
