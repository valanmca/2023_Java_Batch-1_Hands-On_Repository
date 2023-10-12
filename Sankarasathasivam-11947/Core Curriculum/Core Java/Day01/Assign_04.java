
//Write a Java program to print Star pattern

package com.shiva.core.day01;

import java.util.Scanner;

public class Assign_04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rows");
		int rows=sc.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
