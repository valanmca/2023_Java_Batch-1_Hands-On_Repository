//find second top element of the stack
package com.matthew.day03;
import java.util.Stack;
public class Assignment2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.pop();
		System.out.println("Second top element: "+ stack.peek());
	}

}
