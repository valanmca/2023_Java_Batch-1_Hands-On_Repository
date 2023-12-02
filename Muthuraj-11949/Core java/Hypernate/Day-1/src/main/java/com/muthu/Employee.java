package com.muthu;

import java.lang.annotation.Native;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp_table2")
public class Employee {
	
	@Id
	@Column(name ="Emp_id")
	private int id ;
	
	@Column(name ="Emp_name")
	private String name;
	
	@Column(name ="Emp_salary")
	private int salary;
	
	
	
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
}
