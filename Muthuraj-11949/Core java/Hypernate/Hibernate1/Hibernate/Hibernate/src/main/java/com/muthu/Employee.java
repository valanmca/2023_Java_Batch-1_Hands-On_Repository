package com.muthu;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
@NamedQueries({
	@NamedQuery(name="SelectAllEmployee", query="from Employee")
})

@Entity
@Table(name ="emp_table6")
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
