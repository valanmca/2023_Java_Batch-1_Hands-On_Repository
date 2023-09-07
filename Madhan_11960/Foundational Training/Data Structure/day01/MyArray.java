package com.madhan.day01;
import java.util.*;

public class MyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the StudentId:");
		int sId=sc.nextInt();
		
//		int sId=11960;
		System.out.println("Enter the StudentName:");
		String sName=sc.next();
//		String sName="Madhan";
		System.out.println("Enter the Marks:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
//		int m1=80,m2=98,m3=90;
		System.out.println("Enter the Total:");
		int sum=m1+m2+m3;
		System.out.println("Total :" +sum);
		System.out.println("Enter the Average:");
		int avg=sum/3;
		System.out.println("Average :" +avg);
		
//		System.out.println("StudentId :" +sId);
//		System.out.println("StudentName :" +sName);
//		System.out.println("mark1 :" +m1);
//		System.out.println("mark2 :" +m2);
//		System.out.println("mark3 :" +m3);
//		System.out.println("Total :" +sum);
//		System.out.println("Average :" +avg);

	}

}
