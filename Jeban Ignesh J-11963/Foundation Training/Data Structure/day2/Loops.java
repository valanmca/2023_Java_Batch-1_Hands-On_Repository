package com.jeban.day2;

import java.util.*;

public class Loops {
	public static void main(String[] args) {
		System.out.println("Enter the Size:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("The number is:" + n);
		String s = "";
		for (int i = 0; i < n; i++) {
			s = s + "*";
			System.out.println(s);
		}

	}

}
