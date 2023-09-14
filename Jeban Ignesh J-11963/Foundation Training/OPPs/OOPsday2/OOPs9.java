package com.jeban.OOPsday2;

class Student{
	String sName;
	int m1;
	int m2;
	int m3;
	
	Student(String sName,int m1,int m2, int m3){
		this.sName=sName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	int Sum() {
		int Total=m1+m2+m3;
		return Total;
	}
	int Average() {
		int average=(m1+m2+m3/3);
//		System.out.println("Average:"+average);
		return average;
		
		
	}
	String Grade() {
		String grade="";
		if( Average() >=90) {
			grade="A";}
		else if( Average()>=60 &&  Average()<90)
			grade="B";
		else
			grade="c";
		return grade;
			
		
		
	}
	void display() {
		System.out.println("Student Name:"+sName);
		System.out.println("Mark1:"+m1);
		System.out.println("Mark2:"+m2);
		System.out.println("Mark:"+m3);
		System.out.println("total marks:"+Sum());
		System.out.println("Average:"+Average());
		System.out.println("Grade:"+Grade());
	}
}

public class OOPs9 {

	public static void main(String[] args) {
		Student obj1=new Student("Jeban",90,78,89);
		obj1.display();
		
		
		
		
		

	}

}
