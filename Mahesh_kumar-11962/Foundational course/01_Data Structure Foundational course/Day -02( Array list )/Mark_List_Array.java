package com.mahesh.ds_day2;

import java.util.Scanner;

public class Mark_List_Array {

	public static void main(String[] args) 
	{
		Scanner Sc_object = new Scanner(System.in);
		
		int rollno;
		String Sname;
		char section;
		int marks[] = new int[5];
		int sum=0;
		
		System.out.print("Enter your name : ");
		Sname = Sc_object.next();
		System.out.print("Enter your rollno : ");
		rollno = Sc_object.nextInt();
		System.out.print("Enter your Section/Batch : ");
		section=Sc_object.next().charAt(0);
		System.out.println("Enter your 5 subjectmarks one by one : ");
		for(int i=0;i<marks.length;i++)
		{
		marks[i] = Sc_object.nextInt();	
		}
		System.out.print("\nname : "+Sname);
		System.out.print("\nrollno : "+rollno);
		System.out.print("\nBatch : "+section);
		System.out.print("\n Subjectmarks are: \n");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("\nMark"+(i+1)+" is :"+marks[i]); 	
		}
		System.out.print("\nTotal Marks : ");
		for(int i=0;i<marks.length;i++)
		{
			sum =sum+marks[i]; 	
		}
		System.out.print(sum);
		byte avg= (byte) (sum/marks.length);
		System.out.print("\nAvg mark : "+avg);
	}

}
