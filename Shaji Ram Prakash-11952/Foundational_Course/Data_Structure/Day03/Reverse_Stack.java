package com.shaji.Day03;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		stack1.push(10);// Adding the Elements
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);

		System.out.println("Stack_1 : " + stack1);
		
	
		while(!stack1.isEmpty()) {
			int s = stack1.pop();
			stack2.push(s);
		}
		System.out.println("Stack_2 : " + stack2);
	}

}
