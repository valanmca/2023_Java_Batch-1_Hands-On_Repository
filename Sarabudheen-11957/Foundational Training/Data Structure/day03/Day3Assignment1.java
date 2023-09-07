/******** Find Size of Stack Without Using size() Method... *******/
package com.sara.day03;

import java.util.Stack;

public class Day3Assignment1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);

		int count = 0;
		while (!stack.isEmpty()) {
			stack.pop();
			count++;
		}
		System.out.println(count);
	}

}
