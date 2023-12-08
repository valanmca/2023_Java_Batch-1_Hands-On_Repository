package com.vms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_vms")
public class Vehicle {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "owner")
	private String owner;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "price")
	private int price;

	public Vehicle(int id, String brand, String owner, String contact, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.owner = owner;
		this.contact = contact;
		this.price = price;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", owner=" + owner + ", contact=" + contact + ", price="
				+ price + "]";
	}

}
