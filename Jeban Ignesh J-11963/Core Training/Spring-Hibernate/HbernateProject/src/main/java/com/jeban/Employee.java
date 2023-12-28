package com.jeban;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name="SelectAllEmployee", query = "from Employee")
})

@Entity
@Table(name = "tbl_emp")
public class Employee {
	@Id
	@Column(name = "Empid")
	private int id;
	@Column(name = "Empname")
	private String name;
	@Column(name = "Empsalary")
	private int salary;
	@Column(name = "Empdno")
	private int dno;

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
