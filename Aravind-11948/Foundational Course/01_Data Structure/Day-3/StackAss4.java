package com.aravind.day3;//reversing the stack

import java.util.Stack;

public class StackAss4 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("stack value = " + stack);

		Stack<Integer> stack1 = new Stack<Integer>();

		while (!stack.isEmpty())

		{
			int val = stack.pop();
			stack1.push(val);
		}
		System.out.println("reverse stack value = " + stack1);

	}

}
