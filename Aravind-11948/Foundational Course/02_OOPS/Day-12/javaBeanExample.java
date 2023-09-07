package com.aravind.day12;

class Employee2 {
	private int id;
	private String ename;
	private float esalary;

	

public Employee2(int id, String ename, float esalary) {
		super();
		this.id = id;
		this.ename = ename;
		this.esalary = esalary;
	}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getEname() {
	return ename;
}



public void setEname(String ename) {
	this.ename = ename;
}



public float getEsalary() {
	return esalary;
}



public void setEsalary(float esalary) {
	this.esalary = esalary;
}


public void display()
{
	System.out.println(id);
	System.out.println(ename);
	System.out.println(esalary);
	
	
}
}



public class javaBeanExample {

	public static void main(String[] args) {
		Employee2 obj= new Employee2(11948,"aravind",10000);
		obj.display();
		obj.setId(11950);
		//obj.display();
		System.out.println(obj. getId());
		
		

	}

}
