package com.swetha.day3;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		String val="";
		for(int i=1;i<=n;i++) {
			val=val+"*";
			System.out.println(val);
		}
		

	}

}
