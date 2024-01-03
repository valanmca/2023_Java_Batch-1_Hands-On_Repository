package com.sms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students {

	@Id
	@Column(name="rno")
	private int rno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dept")
	private String dept;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Students(int rno, String name, String dept) {
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
		return "Students [rno=" + rno + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
