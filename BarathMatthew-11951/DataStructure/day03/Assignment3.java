//Reversing the Stack
package com.matthew.day03;

import java.util.Stack;

public class Assignment3 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> updatedstack = new Stack<Integer>();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		System.out.println(stack);
		while(!stack.isEmpty()) {
			updatedstack.push(stack.pop());
		}
		System.out.println("Reversed Stack: "+ updatedstack);
	}

}
