//H/W : Pattern. [use only one loop].

package com.naveen.day3;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of times :"); //Getting input from user
		int n = sc.nextInt();

		String s = ""; 							//Initializing one empty string
		for (int i = 1; i <= n; i++) {
			s += "*";                           //It concatenates * with empty string until loop satisfied.
			System.out.println(s);				//Printing the * at every single iteration.
		}
		
		sc.close();	}

}
