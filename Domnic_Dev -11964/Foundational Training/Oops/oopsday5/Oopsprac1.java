package com.domnic.oopsday5;
//JavaBeans are classes that encapsulate many objects into a single object
//using get and set
class Emp {
	private String ename;
	private int eid;
	private float esal;

	void display() {
		System.out.println("Name of the Employee is :" + ename);
		System.out.println("Employee id of " + ename + " is " + eid);
		System.out.println("Salaray of " + ename + " is " + esal);

	}

	public Emp(String ename, int eid, float esal) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.esal = esal;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

}

public class Oopsprac1 {

	public static void main(String[] args) {
		Emp obj = new Emp("Domnic", 11964, 100.0f);
		obj.display();
		System.out.println();
		obj.setEsal(200.0f);
		obj.display();
	}

}
