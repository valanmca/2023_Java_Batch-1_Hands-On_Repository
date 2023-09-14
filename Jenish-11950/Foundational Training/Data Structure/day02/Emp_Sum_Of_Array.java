package com.jenish.day02;

import java.util.Scanner;

public class Emp_Sum_Of_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[3];
		System.out.println("Employee Id:");
		int empId=sc.nextInt();
		
		System.out.println("Employee Name:");
		String empName=sc.next();
		
		System.out.println("Enter Three Subject Marks"+"\n");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		int avg=sum/3;
		
		System.out.println("Employee Id:"+empId+"\n");
		System.out.println("Employee Name:"+empName+"\n");
		for(int i=0; i<marks.length;i++) {
			System.out.println("marks" +(i+1)+ ":" +marks[i]);
		}
		System.out.println("Total Marks:"+sum+"\n");
		System.out.println("Average Marks:"+avg+"\n");
		sc.close();
	}
	

	}

