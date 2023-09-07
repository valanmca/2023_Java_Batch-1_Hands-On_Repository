package com.dharshu.day3;

import java.util.Scanner;

public class PatterJava {

	public static void main(String[] args) {
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
