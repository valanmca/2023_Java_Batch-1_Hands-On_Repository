package com.matthew;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "SelectAllEmployee", query ="from Employee"),
	@NamedQuery(name = "DeleteEmployee1",query = "")
})

@Entity
@Table(name = "tbl_employee")
public class Employee {
	@Id
	@Column(name="eId")
	private int eId;
	@Column(name="eName")
	private String eName;
	@Column(name = "eSalary")
	private int eSalary;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	
	
}
