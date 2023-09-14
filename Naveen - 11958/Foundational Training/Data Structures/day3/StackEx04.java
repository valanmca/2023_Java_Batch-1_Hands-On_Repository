//Find the second top Element.

package com.naveen.day3;

import java.util.Stack;

public class StackEx04 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("The Stack are: "+stack);
		stack.pop();
		System.out.println(stack.peek());
		
	}

}
