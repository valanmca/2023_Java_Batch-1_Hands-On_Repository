package com.ems.bean;
public class Employee {
int Employee_id;
String Employee_name;
String Employee_department;


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int Employee_id,String Employee_name,String Employee_department)
{
	super();
	this.Employee_id = Employee_id;
	this.Employee_name = Employee_name;
	this.Employee_department = Employee_department;
}

public int getEmployee_id() {
	return Employee_id;
}

public void setEmployee_id(int employee_id) {
	Employee_id = employee_id;
}

public String getEmployee_name() {
	return Employee_name;
}

public void setEmployee_name(String employee_name) {
	Employee_name = employee_name;
}

public String getEmployee_department() {
	return Employee_department;
}

public void setEmployee_department(String employee_department) {
	Employee_department = employee_department;
}





}