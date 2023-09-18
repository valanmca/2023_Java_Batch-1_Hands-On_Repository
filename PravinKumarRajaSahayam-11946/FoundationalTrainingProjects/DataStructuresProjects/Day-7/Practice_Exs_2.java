package com.pravinkumar.day7;

import java.util.Scanner;

public class Practice_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Letter:");
		String first = sc.next();

		System.out.println("Enter the Second Letter:");
		String second = sc.next();

		String Third = first + " " + second;
		System.out.println("The add Letter is : " + Third);
	}

}
