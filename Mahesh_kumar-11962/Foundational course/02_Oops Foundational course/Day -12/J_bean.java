package com.mahesh.Oops_day12;

public class J_bean {
	private int empid;
	private float empsalary;
	private String empname; // java bean collection of private fields public getter,setter .
	// plain old java object ( POJO )

	public J_bean(int empid, float empsalary, String empname) { 
		//source =>select "Genarate constructor using field"
		super();
		this.empid = empid;
		this.empsalary = empsalary;
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void display() {
		System.out.println("EMPID :" + empid);
		System.out.println("EMPNAME :" + empname);
		System.out.println("EMPSALARY :" + empsalary);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J_bean object = new J_bean(11, 20000.00f, "mahesh");
		object.display();

	}

}
