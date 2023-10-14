package com.jenish.day1;

import java.util.Scanner;

public class Ex04_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String s="";		
		for(int i=1;i<=num;i++)
		{
			s+="*";
			System.out.println(s);
		}
	}
}
