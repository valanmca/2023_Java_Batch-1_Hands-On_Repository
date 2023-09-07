package com.mahesh.Oops_day9;

public class Student_Oops {
	
	String Sname;
	int Smark1,Smark2,Smark3,avg;
	
	Student_Oops(String Sname,int Smark1,int Smark2,int Smark3)
	{
		this.Sname=Sname;
		this.Smark1=Smark1;
		this.Smark2=Smark2;
		this.Smark3=Smark3;
		
	}
	 int average()
	 {
		 int avg =(this.Smark1+this.Smark2+this.Smark3)/3;
		 return avg;
	 }
	 void disp()
	 {
		 System.out.println("Student Name :"+Sname);
		 System.out.println("Student DS Mark :"+Smark1);
		 System.out.println("Student JAVA Mark :"+Smark2);
		 System.out.println("Student ANGULAR Mark :"+Smark3);
		 System.out.println("Student Average Mark :"+average());
		 System.out.println();
		 
	 }
	public static void main(String[] args) {
		Student_Oops mahesh = new Student_Oops("Mahesh",90,80,70);
	
		mahesh.disp();
		Student_Oops dominic = new Student_Oops("Dominic",85,88,82);

		dominic.disp();

	}

}
