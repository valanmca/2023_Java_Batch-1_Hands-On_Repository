package com.gayathri.day9;

public class StudentClass {
	String name;
	int m1, m2, m3;
	int total;
	float avg;

	StudentClass(String name,int m1,int m2,int m3)
	{
		this.name = name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void calculate()
	{
		total = m1+m2+m3;
		avg = total/3;
	}
	void display()
	{
		System.out.println("Student name : "+name);
		System.out.println("Total mark : "+total);
		System.out.println("Average : "+avg);
	}

	public static void main(String[] args) {
		StudentClass obj = new StudentClass("Gayathri",100,100,100);
		obj.calculate();
		obj.display();
	}

}
