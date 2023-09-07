package com.purushoth.day1;
import java.util.Scanner;

public class InputGet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		int sId=sc.nextInt();
		System.out.println("Enter the student name: ");
		String sName=sc.next();
		System.out.println("Enter three subject Marks: ");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int sum=m1+m2+m3;
		int avg=sum/3;
		System.out.println("Student Id is: "+sId);
		System.out.println("Student Name is: "+sName);
		System.out.println("Mark of subject 1: "+m1);
		System.out.println("Mark of subject 2: "+m2);
		System.out.println("Mark of subject 3:  "+m3);
		System.out.println("Total Marks: "+sum);
		System.out.println("Average Mark:  "+avg);
		
	}

}
