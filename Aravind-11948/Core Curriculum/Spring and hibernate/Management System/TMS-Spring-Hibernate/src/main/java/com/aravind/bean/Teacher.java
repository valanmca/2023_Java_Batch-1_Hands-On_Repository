package com.aravind.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_teacher")
public class Teacher {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="salary")
	private Double salary;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String subject, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.salary = salary;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", salary=" + salary + "]";
	}
	
	
	
	

}
