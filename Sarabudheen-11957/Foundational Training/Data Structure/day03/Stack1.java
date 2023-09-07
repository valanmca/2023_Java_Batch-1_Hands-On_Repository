/****** Adding,Deleting and Returning Top Element from the Stack... ******/
package com.sara.day03;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

		// Adding Elements to The Stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);

		stack.pop();// Deleting Top Element from Stack
		System.out.println(stack);

		System.out.println(stack.peek());// Returning the top Element of the Stack
		System.out.println(stack.get(1));

		System.out.println("The Size of The Stack is : " + stack.size());// Size of The Stack
		System.out.println(stack.isEmpty());

	}

}
