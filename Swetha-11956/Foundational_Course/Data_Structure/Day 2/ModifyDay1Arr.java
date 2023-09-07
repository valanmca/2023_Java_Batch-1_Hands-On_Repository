package com.swetha.day2;

import java.util.Scanner;

public class ModifyDay1Arr {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int sId=sc.nextInt();
		
		System.out.println("Enter Student Name :");
		String sName=sc.next();
		
		int mark[]=new int[3];
		
		System.out.println("Enter three subject marks :");
		for(int i=0;i<mark.length;i++) {
			mark[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<mark.length;i++) {
			sum=sum+mark[i];
		}
		
		int avg=sum/3;
		System.out.println("Student Id : "+sId);
		System.out.println("Student Name : "+sName);
		
		for(int i=0;i<mark.length;i++) {              //Replacing for loop,for the next three lines,for printing m1,m2,m3
			System.out.println("Student Mark "+(i+1)+":" +mark[i]);
		}
		//System.out.println("Student Mark 1 :"+ m1);
		//System.out.println("Student Mark 2 :"+m2);
		//System.out.println("Student Mark 3 :"+ m3);
		
		System.out.println("Total Marks :"+sum);
		System.out.println("Average Marks :"+avg);

	}

}
