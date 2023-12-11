package com.sms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_studentdet")
public class Student {
	@Id
	@Column(name = "stu_rno")
	private int rno;
	@Column(name = "stu_name")
	private String name;
	@Column(name = "stu_email")
	private String email;
	@Column(name = "stu_standard")
	private String standard;
	@Column(name = "stu_location")
	private String location;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [Rollno =" + rno + "," + "Name =" + name + "," + " Email=" + email + "," + " Standard="
				+ standard + "," + " Location=" + location + "]";
	}

}
