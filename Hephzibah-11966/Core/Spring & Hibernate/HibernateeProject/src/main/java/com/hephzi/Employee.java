package com.hephzi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@NamedQueries({
//	@NamedQuery(name="SelectAllEmployee", query="from Employee")
//	
//})


@NamedNativeQuery(name="SelectAllEmployee", query="select * from tbl_employee", resultClass=Employee.class)

@Entity
@Table(name="tbl_employee")

public class Employee {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="dno")
	private int dno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = name;
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
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + ", dno=" + dno + "]";
	}
	
}
