package com.shiva.day01;

//Getting values, sum and avg
import java.util.*;
public class StudentDetail {

	public static void main(String[] args) {
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
		float avg=sum/3;
		System.out.println("Average : "+avg);
	}
}