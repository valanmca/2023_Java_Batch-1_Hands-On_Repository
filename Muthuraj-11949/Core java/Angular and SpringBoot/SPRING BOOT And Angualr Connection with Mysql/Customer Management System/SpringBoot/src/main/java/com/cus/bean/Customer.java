package com.cus.bean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="tbl_customer")
public class Customer {
	@Id
	@Column(name="cus_ID")
	private int cusID;
	
	@Column(name="cus_name")
    private String cusname;
	
	@Column(name="cus_Email")
    private  String cusEmail;
	
	@Column(name="cus_ContactNumber")
    private  long cusContactNumber;
	
	@Column(name="cus_Location")
    private  String cusLocation;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public long getCusContactNumber() {
		return cusContactNumber;
	}

	public void setCusContactNumber(long cusContactNumber) {
		this.cusContactNumber = cusContactNumber;
	}

	public String getCusLocation() {
		return cusLocation;
	}
	public void setCusLocation(String cusLocation) {
		this.cusLocation = cusLocation;
	}
	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", cusname=" + cusname + ", cusEmail=" + cusEmail + ", cusContactNumber="
				+ cusContactNumber + ", cusLocation=" + cusLocation + "]";
	}	
}	
