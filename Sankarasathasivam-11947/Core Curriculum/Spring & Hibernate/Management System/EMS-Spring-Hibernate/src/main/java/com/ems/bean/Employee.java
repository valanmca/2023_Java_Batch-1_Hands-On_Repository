package com.ems.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee1")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private int id;

	@Column(name = "ename")
	private String name;

	@Column(name = "salary")
	private int salary;

	@Column(name = "dno")
	private int dno;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int salary, int dno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dno = dno;
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

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dno=" + dno + "]";
	}

}
