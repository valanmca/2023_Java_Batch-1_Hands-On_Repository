package com.purushoth.day_01;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int row=sc.nextInt();
		for (int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/* 4. Write a Java program to print the pattern like below.
  *
  * *
  * * *
  * * * *
  * * * * *
*/
