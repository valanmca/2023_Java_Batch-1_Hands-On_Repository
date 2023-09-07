//Reverse the element

package com.jeyandhan.day03;

import java.util.Stack;

public class Day3Assignment4 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack1 = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("The Original Stack: " + stack);
		while (!stack.isEmpty()) {

			int a = stack.pop();

			stack1.push(a);
		}
		System.out.println("\nThe Reversed Stack: " + stack1);

	}

}