// Find the second top element in the stack.
package com.jeyandhan.day03;

import java.util.Stack;

public class Day3Assignment3 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("The Elements in the stack are: ");
		stack.pop();
		System.out.println("The second Top element is: " + stack.peek());

	}

}
