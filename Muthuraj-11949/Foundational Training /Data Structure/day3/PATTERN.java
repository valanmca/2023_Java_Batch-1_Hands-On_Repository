package com.muthu.day3;

import java.util.Scanner;

public class PATTERN {

	public static void main(String[] args) {
		
		String star = "";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values: ");
		int value = sc.nextInt();
		
		for (int i=0; i<value; i++)
			{
			star=star+"*";
		System.out.println(star);
		}

	}

}
