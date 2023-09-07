//Searching the given Element from Stack
package com.domnic.day3;

import java.util.Stack;
import java.util.Scanner;

public class StackEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(86);
		stack.push(23);
		stack.push(76);
		stack.push(12);
		stack.push(89);
		stack.push(90);

		System.out.println(stack);
		System.out.println("Enter the number to be found :");
		int num = sc.nextInt();
		int temp = 0;
		while (!stack.isEmpty()) {

			if (stack.pop() == num) {
				System.out.println("Yes");
				temp++;
			}
		}

		if (temp == 0) {
			System.out.println("no");
		}
		//SHORTCUT
		// if(stack.contain(num))
		// System.out.println(yes);
		// else
		// System.out.println(no)

	}
}
