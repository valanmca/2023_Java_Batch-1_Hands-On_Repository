package com.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
private int id;
private String name;
private int salary;
@Autowired
private Address address;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
/*public void display()
{
	System.out.println("Employee Id : " + id);
	System.out.println("Employee Name : " + name);
	System.out.println("Employee Salary : " + salary);
}*/

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
