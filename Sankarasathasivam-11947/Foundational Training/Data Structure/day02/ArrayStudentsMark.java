package com.shiva.day02;

//Getting marks using Array

import java.util.*;
public class ArrayStudentsMark {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		
		System.out.println("Enter Student Id");
		int sId=sc.nextInt();
		
		System.out.println("Enter the Student Name");
		String sName=sc.next();
		
		System.out.println("Enter the Subject Marks");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		
		int avg=sum/5;
		
		System.out.println("Student Id : "+sId);
		System.out.println("Student Name : "+sName);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Mark "+(i+1) +" : " +marks[i]);
		}
		
		System.out.println("Total Marks : "+sum);
		System.out.println("Average marks: "+avg);
	}
}