package com.mahesh.ds_day3;
import java.util.Scanner;
public class Pattern_Assignment {
 //Pattern printing using single loop
	public static void main(String[] args) {
		String pattern="";
		Scanner sc =new Scanner(System.in);
		System.out.println("\nPattern Printing");
		System.out.println("\n\nEnter Your input:");
		int input=sc.nextInt();
		for(int index=0;index<input;index++)
		{
			pattern=pattern+"*";
			System.out.println(pattern);
		}

	}

}
