//Find the size of the stack. [Note : do not use size() method]
package com.jeyandhan.day03;

import java.util.Stack;

public class Day3Assignment {

	public static void main(String[] args) {
		int count = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("The Elements in the Stack are: "+stack);
		
		while (!stack.isEmpty()) {
			stack.pop();
			count++;
		}
		System.out.println("The Size of the Stack is: "+count);
	}

}
