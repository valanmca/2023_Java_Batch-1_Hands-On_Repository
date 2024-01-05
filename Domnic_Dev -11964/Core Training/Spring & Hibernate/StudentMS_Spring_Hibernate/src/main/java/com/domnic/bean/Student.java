package com.domnic.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {

	@Id
	@Column(name = "std_id")
	private int std_id;
	
	@Column(name = "std_name")
	private String std_name;
	
	@Column(name = "std_sec")
	private String std_sec;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int std_id, String std_name, String std_sec) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_sec = std_sec;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_sec() {
		return std_sec;
	}

	public void setStd_sec(String std_sec) {
		this.std_sec = std_sec;
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_sec=" + std_sec + "]";
	}
	
	
}
