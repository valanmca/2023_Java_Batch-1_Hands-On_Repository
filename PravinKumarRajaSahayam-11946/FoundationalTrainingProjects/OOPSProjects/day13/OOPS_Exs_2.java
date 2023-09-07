//Using OOPS for change the values of the constructors(Public , Private Class Specifiers)
package com.pravinkumar.day13;
//Find How to use Private , Public for get the values or numbers
class Employee1 {
	private int eid;
	private String ename;
	private float esalary;

	Employee1(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public void setEsalary(float esalary) // Setter
	{
		this.esalary = esalary;
	}

	public float getEsalary() // Getter
	{
		return this.esalary;
	}

	void display() {
		System.out.println("The Employee initial values is : " + eid);
		System.out.println("The Employee initial values is : " + ename);
		System.out.println("The Employee initial values is : " + esalary);
	}
}

public class OOPS_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee(10111, "PravinKuumar", 1.0f);
		obj.display();
		obj.setSalary(9.0f);
		obj.display();
	}

}
