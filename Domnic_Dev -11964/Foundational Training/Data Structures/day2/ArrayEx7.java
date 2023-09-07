package com.domnic.day2;

import java.util.Scanner;

public class ArrayEx7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the student ID");
		 int sId=sc.nextInt();
		 
		 System.out.println("Enter the student name");
		 String sName=sc.next();
		 
		 int marks[]=new int[3];
		 System.out.println("Enter the marks of the Students");
		 for(int i=0;i<marks.length;i++) {
			 marks[i]=sc.nextInt();	
			 }
		int sum=0;
		for(int i=0;i<marks.length;i++) {	
			sum=sum+marks[i];
		}
		
		int avg= sum/3;
		
		
		  System.out.println("Student id :"+sId);
		  System.out.println("Student Name :"+sName);
		  for(int i=0;i<marks.length;i++) {
			  System.out.println("Subject "+(i+1)+"-"+marks[i]);
		  }
		  System.out.println("Subject Total :"+sum);
		  System.out.println("Subject Average :"+avg);

	}

}
