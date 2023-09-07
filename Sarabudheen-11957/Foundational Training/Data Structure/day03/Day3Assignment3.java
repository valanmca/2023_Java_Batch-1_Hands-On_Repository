/*********** Find the Second Top Element of The Stack... *********/
package com.sara.day03;

import java.util.Stack;

public class Day3Assignment3 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		stack.pop();
		System.out.println("The Second Element of The Stack is : " + stack.peek());

	}
}