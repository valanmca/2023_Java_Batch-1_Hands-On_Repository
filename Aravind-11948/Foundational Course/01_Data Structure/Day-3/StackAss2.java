package com.aravind.day3;// searching the given elements from the stack

import java.util.Scanner;
import java.util.Stack;

public class StackAss2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("stack value = " + stack);

		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int temp = 0;

		while (!stack.isEmpty()) {
			temp = 0;
			int val = stack.pop();
			if (n == val) {
				temp = 1;

				break;
			} else {
				temp = 0;

			}
		}

		if (temp == 1) {
			System.out.println("yes ");
		} else {
			System.out.println("no");
		}

	}

}
