//Reversing Stack
package com.domnic.day3;


import java.util.Stack;

public class StackEx5 {

	public static void main(String[] args) {
		
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		
		stack1.push(86);
		stack1.push(23);
		stack1.push(76);
		stack1.push(12);
		stack1.push(89);
		stack1.push(90);
		System.out.println(stack1);
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());

		}
		System.out.println(stack2);

	}

}
