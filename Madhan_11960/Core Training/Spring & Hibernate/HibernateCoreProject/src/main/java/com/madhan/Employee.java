package com.madhan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@NamedQueries(
//		{
//			@NamedQuery(name="SelectAllEmployee", query = "from Employee")
//		})

@NamedNativeQuery(name = "SelectAllEmployee", query = "select * from tbl_Employee", resultClass = Employee.class)
//@NamedNativeQuery(name = "SelectAllEmployee", query = "update tbl_Employee set salary=15000 where EmpID=103", resultClass = Employee.class)

@Entity
@Table(name = "tbl_employee")
public class Employee {
	@Id
	@Column(name = "EmpID")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Salary")
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
