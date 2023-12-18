package com.mob.bean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="Mob5")
public class Mobile {
	@Id
	@Column(name="mob_ID")
		    private int mobID;
	
	@Column(name="mob_Brandname")
		    private String mobBrandName;
	
	@Column(name="mob_Modelname")

		    private String mobModelname;
	@Column(name="mob_Price")
		    private int mobPrice;
	public Mobile() {
		
	}
	public int getMobID() {
		return mobID;
	}
	public void setMobID(int mobID) {
		this.mobID = mobID;
	}
	public String getMobBrandName() {
		return mobBrandName;
	}
	public void setMobBrandName(String mobBrandName) {
		this.mobBrandName = mobBrandName;
	}
	public String getMobModelname() {
		return mobModelname;
	}
	public void setMobModelname(String mobModelname) {
		this.mobModelname = mobModelname;
	}
	public int getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(int mobPrice) {
		this.mobPrice = mobPrice;
	}
	
}
		  