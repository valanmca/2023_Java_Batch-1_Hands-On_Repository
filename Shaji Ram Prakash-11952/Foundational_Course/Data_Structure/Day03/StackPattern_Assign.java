package com.shaji.Day03;

import java.util.Scanner;

public class StackPattern_Assign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String star="";
		System.out.println("Enter the Value count of Star : ");
		int values = sc.nextInt();
		for (int i=0; i<values; i++) {
			star=star+"*";
			System.out.println(star);
		}

	}

}
