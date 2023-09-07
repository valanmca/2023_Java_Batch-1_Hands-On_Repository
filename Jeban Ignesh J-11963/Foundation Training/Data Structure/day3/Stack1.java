package com.jeban.day3;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("size:" + stack.size());

		System.out.println("Stack is empty or not:" + stack.isEmpty());

		stack.push(12);
		stack.push(45);
		stack.push(56);
		System.out.println("Stack:" + stack);

		stack.pop();
		System.out.println(stack);

		System.out.println("Display the First element:" + stack.peek());

		stack.add(0, 87);
		System.out.println("Stack is Empty or not:" + stack.isEmpty());
		System.out.println("Display:" + stack);

		// TODO Auto-generated method stub

	}

}
