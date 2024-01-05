package com.sms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name="rno")
	private int rno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dept")
	private String dept;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rno, String name, String dept) {
		super();
		this.rno = rno;
		this.name = name;
		this.dept = dept;
	}


	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
