//Find the size of the stack. [Note: do not use size() method]

package com.naveen.day3;

import java.util.Stack;

public class StackEx02 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		int size = 0;
		while (!stack.isEmpty()) {
			stack.pop();
			size++;
		}
		

		System.out.println("The size of the Stack is :" + size);

	}

}
