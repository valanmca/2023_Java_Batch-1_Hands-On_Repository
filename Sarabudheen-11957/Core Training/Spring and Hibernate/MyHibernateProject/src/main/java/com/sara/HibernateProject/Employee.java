package com.sara.HibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "SelectAllEmployee",query="from Employee"),
	@NamedQuery(name = "SelectEmployee" , query = "from Employee where id=: id ")
})

@Entity
@Table(name = "Employee")
public class Employee {
	


	@Id
	@Column(name = "Employee_ID")
	private int id;
	
	@Column(name = "Employee_Name")
	private String name;
	
	@Column(name = "Employee_Salary")
	private float salary;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
