/***** Reversing the Stack without Using BuildIn Functions... ******/
package com.sara.day03;

import java.util.Stack;

public class Day3Assignment4 {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		System.out.println("The Initial Stack : " + stack1);

		while (!stack1.isEmpty()) {
			int element = stack1.pop();
			stack2.push(element);
		}
		System.out.println("The Reversed Stack : " + stack2);
	}

}
