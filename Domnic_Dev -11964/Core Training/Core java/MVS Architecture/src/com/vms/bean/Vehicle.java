package com.vms.bean;

public class Vehicle {

	private int vid;
	private String vname;
	private String vtype;

	public Vehicle() {
		super();
	}
	
	

	public Vehicle(int vid, String vname, String vtype) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vtype = vtype;
	}



	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
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
