package com.jeban.day1;

import java.util.Scanner;

public class Calculaterjava {
	public static void main(String[] args) {
		Scanner jeb = new Scanner(System.in);

		System.out.println("No1");
		int m1 = jeb.nextInt();

		System.out.println("No2");
		int m2 = jeb.nextInt();

		int M = m1 + m2;
		int N = m1 / m2;
		int O = m1 * m2;
		int P = m1 - m2;

		System.out.println("addition:" + M);
		System.out.println("division:" + N);
		System.out.println("multiplication:" + O);
		System.out.println("subtraction:" + P);

	}

}
