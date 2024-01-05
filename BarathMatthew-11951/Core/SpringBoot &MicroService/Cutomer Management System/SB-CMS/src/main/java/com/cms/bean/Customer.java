package com.cms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer {
	@Id
	@Column(name="cId")
	private int cId;
	@Column(name="cName")
	private String cName;
	@Column(name="cEmail")
	private String cEmail;
	@Column(name="cNum")
	private int cNum;
	@Column(name="cLoc")
	private String cLoc;
	public Customer() {
		super();
		// TODO Aputo-generated constructor stub
	}
	public Customer(int cId, String cName, String cEmail, int cNum, String cLoc) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cNum = cNum;
		this.cLoc = cLoc;
	}
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	public String getcLoc() {
		return cLoc;
	}
	public void setcLoc(String cLoc) {
		this.cLoc = cLoc;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cNum=" + cNum + ", cLoc=" + cLoc
				+ "]";
	}
	
}
