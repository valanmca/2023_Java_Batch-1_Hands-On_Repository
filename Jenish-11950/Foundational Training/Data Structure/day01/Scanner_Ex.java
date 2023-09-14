package com.jenish.day01;
import java.util.Scanner;


public class Scanner_Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Id:");
		int empId=sc.nextInt();
		
		System.out.println("Employee Name:");
		String empName=sc.next();
		
		System.out.println("Enter Three Subject Marks"+"\n");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		int sum=m1+m2+m3;
		int avg=sum/3;
		
		System.out.println("Employee Id:"+empId+"\n");
		System.out.println("Employee Name:"+empName+"\n");
		System.out.println("Employee Mark1:"+m1+"\n");
		System.out.println("Employee Mark2:"+m2+"\n");
		System.out.println("Employee Mark3:"+m3+"\n");
		System.out.println("Total Marks:"+sum+"\n");
		System.out.println("Average Marks:"+avg+"\n");
		sc.close();
	}

}
