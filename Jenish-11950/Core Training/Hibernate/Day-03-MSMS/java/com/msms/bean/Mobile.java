package com.msms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Mobile")
public class Mobile {

	@Id
	@Column(name = "mble_id")
	private int id;

	@Column(name = "mble_brandname")
	private String brandname;

	@Column(name = "mble_mobilename")
	private String mobilename;

	@Column(name = "mble_price")
	private int price;

	public Mobile(int id, String brandname, String mobilename, int price) {
		super();
		this.id = id;
		this.brandname = brandname;
		this.mobilename = mobilename;
		this.price = price;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brandname=" + brandname + ", mobilename=" + mobilename + ", price=" + price
				+ "]";
	}

}
