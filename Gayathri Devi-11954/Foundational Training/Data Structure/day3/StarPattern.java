package com.gayathri.day3;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int start,end;
		System.out.println("Enter number : ");
		end = sc.nextInt();
		String var = "";
		for(start=1; start<=end;start++)
		{
			var+="*";			
			System.out.println(var);
		}	
		sc.close();
	}

}
