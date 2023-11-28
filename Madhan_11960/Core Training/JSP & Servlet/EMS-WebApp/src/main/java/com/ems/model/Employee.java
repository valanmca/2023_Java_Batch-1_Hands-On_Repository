package com.ems.model;

public class Employee {
	
	private int  stu_id;
	private  String stu_name;
	private  String stu_dep;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

		

	public Employee(int stu_id, String stu_name, String stu_dep) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_dep = stu_dep;
	}



	public int getStu_id() {
		return stu_id;
	}


	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}


	public String getStu_name() {
		return stu_name;
	}


	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}


	public String getStu_dep() {
		return stu_dep;
	}


	public void setStu_dep(String stu_dep) {
		this.stu_dep = stu_dep;
	}

}
