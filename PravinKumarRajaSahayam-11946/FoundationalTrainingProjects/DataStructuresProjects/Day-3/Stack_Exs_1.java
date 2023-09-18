package com.pravinkumar.day3;

import java.util.Stack;

public class Stack_Exs_1 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		// Finding Stack size Method
		System.out.println("The Stack Size Initially is " + stack.size());

		// Finding IsEmpty Method
		System.out.println("Is the Stack is Empty: " + stack.isEmpty());

		// Finding ADDING Method
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Adding the Stack from the: " + stack);

		// For Remove in the top of the Element Method
		stack.pop();
		System.out.println("Removing the top Element: " + stack);

		// Displaying or Returning the Top of the Element Method
		System.out.println("Peek: " + stack.peek());

		// After Adding Element in the Stack Finding the Element in the Stack list
		System.out.println("The Stack Size is: " + stack.size());

		// After Adding Finding Element in the Stack
		System.out.println("The Stack is: " + stack);

		// After Adding Element Check the IsEmpty() Method
		System.out.println("Is the Empty is Empty: " + stack.isEmpty());
	}
}
