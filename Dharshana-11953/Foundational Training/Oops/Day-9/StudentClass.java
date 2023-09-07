package com.dharshu.day9;
class student{
	String name;
	int m1,m2,m3;
	int total;
	int avg;
	
	student(String name,int m1,int m2,int m3){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	void calculate() {
		total=m1+m2+m3;
		avg=total/3;
	}
	void display() {
		System.out.println("\n\nStudent name:"+name);
		System.out.println("Mark1:"+m1);
		System.out.println("Mark2:"+m2);
		System.out.println("Mark3:"+m3);
		System.out.println("Total:"+total);
		System.out.println("Average:"+avg);
	}
}



public class StudentClass {

	public static void main(String[] args) {
		student std=new student("Dharshu",50,50,50);
		std.calculate();
		std.display();
		
		
		student std1=new student("Gayu",70,70,70);
		std1.calculate();
		std1.display();

	}

}
