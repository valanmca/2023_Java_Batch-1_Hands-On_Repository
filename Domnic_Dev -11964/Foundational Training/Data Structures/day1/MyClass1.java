package com.domnic.day1;
import java.util.Scanner;

public class MyClass1 {
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the student ID");
		 int sId=sc.nextInt();
		 
		 System.out.println("Enter the student name");
		 String sName=sc.next();
		 
		 System.out.println("Enter the Marks of the subjects");
		 int m1=sc.nextInt();
		 int m2=sc.nextInt();
		 int m3=sc.nextInt();
		 int sum=m1+m2+m3;
		 int avg=sum/3;
		 
	  System.out.println("Student id :"+sId);
	  System.out.println("Student Name :"+sName);
	  System.out.println("Student Mark 1 :"+m1);
	  System.out.println("Student Mark 2 :"+m2);
	  System.out.println("Student Mark 3 :"+m3);
	  System.out.println("Student Total :"+sum);
	  System.out.println("Student Average :"+avg);
  }
}
