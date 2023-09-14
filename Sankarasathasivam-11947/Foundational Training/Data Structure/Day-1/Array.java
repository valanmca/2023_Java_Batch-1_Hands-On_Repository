package com.shiva.day01;

import java.util.Scanner;
public class Array {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Id");
		int sId=sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String sName=sc.next();
		
		System.out.println("Enter the Subject Marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int sum=m1+m2+m3;
		System.out.println("Total "+sum);
		
		System.out.println("Enter the Average");
		int avg=sum/3;
		System.out.println("Average marks: "+avg);
		
		/*int sId=11947;
		String sName="Shiva";
		int m1=50,m2=60,m3=70;
		int sum=m1+m2+m3;
		int avg=sum/3;
		System.out.println("Student Id : "+sId);
		System.out.println("Student Name : "+sName);
		System.out.println("student mark 1 : "+m1);
		System.out.println("student mark 2: "+m2);
		System.out.println("student mark 3: "+m3);
		System.out.println("Total marks : "+sum);
		System.out.println("Average marks: "+avg);*/

	}

}
