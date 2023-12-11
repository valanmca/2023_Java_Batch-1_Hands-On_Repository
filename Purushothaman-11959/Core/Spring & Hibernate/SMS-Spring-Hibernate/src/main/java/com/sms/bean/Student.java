package com.sms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_studentdetails")
public class Student {
	
	@Id
	@Column(name="std_id")
	private int stdId;
	
	@Column(name="std_name")
	private String stdName;
	
	@Column(name="std_dept")
	private String stdDept;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int stdId, String stdName, String stdDept) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdDept = stdDept;
	}



	public int getStdId() {
		return stdId;
	}



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public String getStdDept() {
		return stdDept;
	}



	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}


	

}
