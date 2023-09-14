package com.naveen.day1;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println("The Number of digits :"+count);
		
	}

}
