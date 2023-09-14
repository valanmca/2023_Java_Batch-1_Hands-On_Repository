package com.swetha.day3;
import java.util.Stack;
public class SecondTop {

	public static void main(String[] args) {
		 
		//Second top element from the stack
		Stack<Integer>stack=new Stack<Integer>();
		
		stack.push(10);	
		stack.push(20);	
		stack.push(30);	
		stack.push(40);	
		
		System.out.println("The stack is "+stack);
		stack.pop();
		System.out.println("The second top element : "+stack.peek());

	}

}
