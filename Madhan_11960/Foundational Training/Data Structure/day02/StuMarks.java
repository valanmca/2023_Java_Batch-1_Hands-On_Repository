package com.madhan.day02;

import java.util.Scanner;

public class StuMarks {

	public static void main(String[] args) {
		int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the StudentId:");
		int sId=sc.nextInt();
		
		System.out.println("Enter the StudentName:");
		String sName=sc.next();

		System.out.println("Enter the Marks:");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
         int sum=0;
         for(int i=0;i<marks.length;i++)
         {
        	 sum=sum+marks[i];
         }
         int avg=sum/3;
	
	System.out.println("StudentId :" +sId);
	System.out.println("StudentName :" +sName);
	for(int i=0;i<marks.length;i++)
	{
		System.out.println("Mark" + (i+1) + ":" +marks[i]);
	}
	System.out.println("Total :" +sum);
	System.out.println("Average :" +avg);
	}
}
