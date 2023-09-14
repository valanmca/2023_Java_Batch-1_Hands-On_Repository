//  Searching the given element from the stack. [Note : use push(),pop()and isEmpty()]
package com.jeyandhan.day03;

import java.util.Stack;

import java.util.Scanner;

public class Day3Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("The Elements in the Stack are: " + stack);

		System.out.println("Enter the value to search: ");
		int value = sc.nextInt();
		int sum = 0;
		while (!stack.isEmpty()) {
			if (stack.pop() == value) {
				System.out.println("Yes it is present...");
				sum++;
				break;
			}
		}
		if (sum == 0) {
			System.out.println("It is not present...");
		}

	}

}
