package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@Column(name="vid")
	private int vno;
	
	@Column(name="vname")
	private String vname;
	
	@Column(name="vtype")
	private String vtype;
	
	

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vehicle(int vno, String vname, String vtype) {
		super();
		this.vno = vno;
		this.vname = vname;
		this.vtype = vtype;
	}



	public int getVno() {
		return vno;
	}



	public void setVno(int vno) {
		this.vno = vno;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}



	public String getVtype() {
		return vtype;
	}



	public void setVtype(String vtype) {
		this.vtype = vtype;
	}



	
	
	
	

}
