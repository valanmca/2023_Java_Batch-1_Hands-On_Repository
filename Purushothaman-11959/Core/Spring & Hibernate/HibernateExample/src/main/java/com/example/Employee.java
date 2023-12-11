package com.example;

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
//})

@NamedNativeQueries({
	@NamedNativeQuery(name="SelectAllEmployee",query="from Employee")
})


@Entity
@Table(name="tbl_emp")
public class Employee {
	@Id
	@Column(name="e_id")
	private int eid;
	
	@Column(name="e_name")
	private String ename;
	
	@Column(name="e_salary")
	private int esalary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
	
	
	

}
