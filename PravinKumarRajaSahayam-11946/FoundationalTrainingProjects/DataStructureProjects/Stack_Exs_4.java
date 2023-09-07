//Find the second top element of Stack.
package com.pravinkumar.day3;

import java.util.Stack;

public class Stack_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		System.out.println(stack.peek());
	}

}
