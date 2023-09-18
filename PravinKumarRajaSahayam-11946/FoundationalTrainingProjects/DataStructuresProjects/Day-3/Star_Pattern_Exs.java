//Star Pattern Program using one for loop
package com.pravinkumar.day3;

import java.util.Scanner;
import java.util.ArrayList;

public class Star_Pattern_Exs {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			printSize(i);
			System.out.println();
		}
	}

	public static void printSize(int count) {
		if (count == 1) {
			System.out.print("*");
			return;
		}
		printSize(count - 1);
		for (int i = 0; i < count; i++) {
			System.out.print("*");
			break;
		}

	}
}
