package com.purushoth.day2;
import java.util.Scanner;
public class Mark_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[3];
		System.out.println("Enter the student ID: ");
		int sId=sc.nextInt();
		System.out.println("Enter the Name: ");
		String sName=sc.next();
		System.out.println("Enter three subject marks: ");
		
		for (int i=0;i<marks.length;i++) {  //To get the marks
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<marks.length;i++) {
			sum =sum+marks[i];
		}
		int avg=sum/3;
		System.out.println("Student Id: "+sId);
		System.out.println("Student Name: "+sName);
		for (int i=0;i<marks.length;i++) {  //To show the marks
		System.out.println("Mark"+(i+1)+":" +marks[i]);
		}
		System.out.println("Total Mark: "+sum);
		System.out.println("Average Mark: "+avg);

	}

}
