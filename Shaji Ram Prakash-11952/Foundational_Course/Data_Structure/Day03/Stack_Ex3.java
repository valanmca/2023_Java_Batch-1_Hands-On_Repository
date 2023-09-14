package com.shaji.Day03;

import java.util.Stack;

public class Stack_Ex3 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(-10);// Adding the Elements
		stack.push(20);
		stack.push(30);
		stack.push(-40);

		System.out.println("The Elements are " + stack);
		
		System.out.println("The First Top Value is " + stack.peek());
		
		stack.pop();
		
		System.out.println("The Second Top Value is " + stack.peek());

	}

}
