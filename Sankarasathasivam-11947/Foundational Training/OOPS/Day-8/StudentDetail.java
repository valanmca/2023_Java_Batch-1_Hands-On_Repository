package com.shiva.day08;

class Students
{
	//variable
	int rollno;
	String sname;
	String department;
	
	//constructor
	Students(int rollno, String sname, String department)
	{
		this.rollno=rollno;
		this.sname=sname;
		this.department=department;
	}
	
	//Method
	void display()
	{
		System.out.println("Student Rollno :"+rollno);
		System.out.println("Student Name :"+sname);
		System.out.println("Department :"+department);
	}
}
public class StudentDetail {

	public static void main(String[] args) {
		Students Shiva=new Students(100,"Shiva","EEE");
		Shiva.display();
		
		Students Madhan=new Students(200,"Madhan","MCA");
		Madhan.display();
	}

}
