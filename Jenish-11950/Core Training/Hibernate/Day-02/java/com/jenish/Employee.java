package com.jenish;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="SelectAllEmployee", query="from Employee")
})

@Entity
@Table(name = "tbl_Employee")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "salary")
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
