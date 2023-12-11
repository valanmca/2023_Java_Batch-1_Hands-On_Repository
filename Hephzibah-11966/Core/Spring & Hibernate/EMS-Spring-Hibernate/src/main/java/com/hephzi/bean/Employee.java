package com.hephzi.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
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

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}s

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

	public Employee(int id, String ename, int salary, int dno) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + ename + ", salary=" + salary + ", dno=" + dno + "]";
	}
    
    
    
   
}