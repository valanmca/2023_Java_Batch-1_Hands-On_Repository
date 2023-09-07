package com.muthu.day1;
import java.util.Scanner;
public class ArrayExample1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Id");
		int sId = sc.nextInt();
		System.out.println("Enter the Student Name");
		String sName= sc.next();
		System.out.println("Enter three subject Marks");
		int m1=sc.nextInt();
	    int m2=sc.nextInt();
		int m3=sc.nextInt();
		int sum=m1+m2+m3;
		int avg=sum/3;
		System.out.println("Enter the college Name");
		String Name= sc.next();
		
		
		
		System.out.println("student id:" +sId);
		System.out.println("student Name:"+sName);
        System.out.println("student Mark1:"+ m1 );
		System.out.println("student Mark2:"+ m2);
		System.out.println("student Mark3:"+ m3);
		System.out.println("Total Marks :"+sum);
		System.out.println("Average Marks:"+avg);	
	}

}
