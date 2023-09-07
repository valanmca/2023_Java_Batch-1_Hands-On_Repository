package com.dharshu.test;

import java.util.Scanner;

public class countdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		sc.close();
		
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("Total no.of digits:"+count);
	
	}

}
