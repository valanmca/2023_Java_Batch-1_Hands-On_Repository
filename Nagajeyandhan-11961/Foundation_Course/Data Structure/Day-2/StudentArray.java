//Student Information using array

package com.jeyandhan.day02;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sId;
		int marks[]=new int[5];
		String sName;
		System.out.println("\t Student Information");
		System.out.println("Enter the studnet Id: ");
		sId=sc.nextInt();
		System.out.println("Enter the studnet Name: ");
		sName=sc.next();
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter the Mark: ");
			marks[i]=sc.nextInt();
		}
		int sum=0;
		int avg;
		for(int i=0;i<marks.length;i++) {
			sum =sum+marks[i];
			 
		}
		avg=sum/3;
		System.out.println("Total : ");
		System.out.println("Average : ");
		System.out.println("\t Student Information");
		System.out.println("Student Id : " +sId);
		System.out.println("Student Name : " +sName);
		for(int i=0;i<marks.length;i++) {
			System.out.println("Mark"+(i+1)+":"+marks[i]);
		}
		System.out.println("Total: " +sum);
		System.out.println("Average: " +avg);
		
	
		
		}

}
