package com.purushoth.day3;
import java.util.Stack;

public class StackPushPopPeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(35);
		stack.push(50);
		
		System.out.println("The stack is: "+stack);
		
		stack.pop();
		
		System.out.println(stack.peek());
		
		
		

	}

}
