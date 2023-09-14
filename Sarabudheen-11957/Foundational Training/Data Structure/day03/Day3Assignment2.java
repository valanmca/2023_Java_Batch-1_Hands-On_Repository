/******** Searching the element in Stack... ********/
package com.sara.day03;

import java.util.Scanner;
import java.util.Stack;

public class Day3Assignment2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);

		System.out.println("Enter The Number to Search : ");
		int number = sc.nextInt();
		int sum = 0;

		while (!stack.isEmpty()) {
			int element = stack.pop();

			if (element == number) {
				System.out.println("True");
				sum++;
				break;
			}
		}
		if (sum == 0) {
			System.out.println("False");
		}
	}

}
