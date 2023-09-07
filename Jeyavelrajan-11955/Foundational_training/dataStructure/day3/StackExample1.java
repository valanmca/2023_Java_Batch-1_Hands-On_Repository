package com.jeyavel.day3;
import java.util.Stack;
public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Is the Stack is Empty :"+stack.isEmpty());
		
		stack.add(10);
		stack.add(20);
		stack.add(30);
		
		System.out.println("Stack values Are :"+stack);
		
		stack.pop();
		
		System.out.println("After Pop the Stack values Are :"+stack);
		
		stack.push(89);
		
		System.out.println("After Applied push() the Output :"+stack);
		
		System.out.println("After Applied peek() The Output : "+stack.peek());
		
		System.out.println("After Applied Size() the Output :"+stack.size());
		
		System.out.println("Is the Stack is Empty :"+stack.isEmpty());

	}

}
