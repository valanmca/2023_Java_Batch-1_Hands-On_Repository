//Using Push,pop,peek,isEmpty,size operations in stack

package com.jeyandhan.day03;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		 
		stack.pop();
		
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);

		System.out.println("The Elements in the Stack are: " + stack); // [11,22,33,44]

		stack.pop(); // remove the Top element
		System.out.println("After removing...the element in the Stack are: " + stack); // [11,22,33]

		System.out.println("The Top Element is: " + stack.peek()); // Print the Top element i.e, [33]

		System.out.println("The Size of the Stack is: " + stack.size()); // 3

		System.out.println("The Stack is Empty: " + stack.isEmpty()); // false

	}

}
